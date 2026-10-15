import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Videojuego> catalogo = Arrays.asList(
                new Videojuego("The Witcher 3", "Rol", 29.99, 2015, 9.8),
                new Videojuego("Super Mario Odyssey", "Plataformas", 49.99, 2017, 9.5),
                new Videojuego("Cyberpunk 2077", "Rol", 39.99, 2020, 7.8),
                new Videojuego("Hollow Knight", "Plataformas", 14.99, 2017, 9.2),
                new Videojuego("DOOM Eternal", "Shooter", 19.99, 2020, 8.9),
                new Videojuego("Stardew Valley", "Simulación", 13.99, 2016, 9.6),
                new Videojuego("Hades", "Acción", 24.99, 2020, 9.7)
        );

        List<String> titulos = catalogo.stream().map(Videojuego::getTitulo).toList();
        System.out.println(titulos);

        List<Videojuego> porGenero = catalogo.stream().
                filter(gen->gen.getGenero().equalsIgnoreCase("Rol"))
                .toList();
        System.out.println(porGenero);

        catalogo.stream().filter(precio->precio.getPrecio()<25.0).map(Videojuego::getTitulo).forEach(System.out::println);

        List<String> generoDis = catalogo.stream().map(Videojuego::getGenero)
                .distinct()
                .toList();
        System.out.println(generoDis);

        List<Videojuego> ordenadoPorAño = catalogo.stream().sorted(Comparator.comparing(Videojuego::getAnoLanzamiento)).toList();
        System.out.println(ordenadoPorAño);

        List<Videojuego> masBaratos = catalogo.stream()
                .sorted(Comparator.comparing(Videojuego::getPrecio))
                .limit(3)
                .toList();
        System.out.println(masBaratos);

        List<Videojuego> mejorPuntuados = catalogo.stream()
                .sorted(Comparator.comparing(Videojuego::getPuntuacion).reversed())
                .limit(2)
                .toList();
        System.out.println(mejorPuntuados);

        List<String> juegos2020 = catalogo.stream().filter(anio->anio.getAnoLanzamiento() == 2020)
                .map(Videojuego::getTitulo).sorted().toList();
        System.out.println(juegos2020);

        double precioTotalJuegos = catalogo.stream()
                .mapToDouble(Videojuego::getPrecio).sum();
        System.out.println(precioTotalJuegos);

        OptionalDouble mediaPuntuacion = catalogo.stream()
                .mapToDouble(Videojuego::getPuntuacion)
                .average();
        if(mediaPuntuacion.isPresent()){
            System.out.println(mediaPuntuacion.getAsDouble());
        }
        //OTRA FORMA DE IMPRIMIR SIN IF
        //mediaPuntuacion.ifPresent(System.out::println)

        Optional<Videojuego> masAntiguo = catalogo.stream().min(Comparator.comparing(Videojuego::getAnoLanzamiento));
        masAntiguo.ifPresent(v->System.out.println(v.getTitulo()));

        Optional<Videojuego> generoDisparo = catalogo.stream().filter(v->v.getGenero().equalsIgnoreCase("Shooter")).findAny();
        generoDisparo.ifPresent(vi->System.out.println(vi.getTitulo()));

        Map<Integer,List<Videojuego>> agrupadoPorAnio = catalogo.stream()
                .collect(Collectors.groupingBy(Videojuego::getAnoLanzamiento));
        System.out.println(agrupadoPorAnio);

        Map<String,Long> cuantosJuegosPorGenero = catalogo.stream()
                .collect(Collectors.groupingBy(Videojuego::getGenero,Collectors.counting()));
        System.out.println(cuantosJuegosPorGenero);

        DoubleSummaryStatistics estadisticas = catalogo.stream().collect(Collectors.summarizingDouble(Videojuego::getPrecio));
        System.out.println(estadisticas.getMax());
        System.out.println(estadisticas.getMin());
        System.out.println(estadisticas.getAverage());
        System.out.println(estadisticas.getSum());

    Optional<String> concatenar = catalogo.stream().map(Videojuego::getTitulo).reduce((a,b)->a + ", " + b);
    concatenar.ifPresent(System.out::println);
    }

}