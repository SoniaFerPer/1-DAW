package ejer2;

import java.util.*;
import java.util.stream.Collectors;

public class ejer2 {
    static List<LineaPedido> lineasPedido = new ArrayList<>();
    public static void main(String[] args) {

        lineasPedido.add(new LineaPedido("Ratón inalámbrico", 29.99, 1, 21));
        lineasPedido.add(new LineaPedido("Arroz bomba 1kg", 2.50, 4, 10));
        lineasPedido.add(new LineaPedido("Zumo de naranja 1L", 1.75, 3, 10));
        lineasPedido.add(new LineaPedido("Pan integral", 1.80, 3, 4));
        lineasPedido.add(new LineaPedido("Libro bestseller", 15.50, 2, 21));
        lineasPedido.add(new LineaPedido("Camiseta algodón", 19.95, 3, 21));
        lineasPedido.add(new LineaPedido("Leche entera", 0.95, 6, 4));
        lineasPedido.add(new LineaPedido("Huevos docena", 2.20, 2, 4));
        lineasPedido.add(new LineaPedido("Cafetera eléctrica", 49.90, 1, 21));
        lineasPedido.add(new LineaPedido("Entrada cine", 5.90, 2, 10));

        // Mostrar las líneas de pedido de la lista
        System.out.println("Líneas de pedido generadas:");
        lineasPedido.forEach(lp -> System.out.printf(
                "- %-20s %2d uds x %5.2f€ (IVA %2d%%) %n",
                lp.getConcepto(), lp.getUnidades(), lp.getPrecioUndidad(), lp.getTipoIVA()
        ));

        double total = totalBrutoPedido();
        System.out.printf("El total es: %.2f€%n", total);

        System.out.println(totalNetoMinUnidades(lineasPedido, 3));
        System.out.println(totalBrutoPorIVA(4));

        Optional<LineaPedido> resultado = lineaPedidoConMasUnidades();

        if(resultado.isPresent()){
            System.out.println("La línea con más unidades es: " + resultado.get());
        }else{
            System.out.println("No hay líneas de pedido.");
        }
        System.out.println(totalBrutoPorIVASuperiorAUmbral(5.0));
    }

    //--SUMATORIO TOTAL--
    public static double totalBrutoPedido(){
        //como en getPrecioTotalBruto ya multiplica por unidad y tb le mete el iva solo hay que sumarlo, no hace falta hacer un grupingBy ni un map con unidad y precio
       /*
        LO QUE HACEMOS ES VOLCAR AL STREAM LOS DATOS DE TODOS LOS PRODUCTOS DE LINEAPRODUCTO
        CADA PRODUCTO LO TRANSFORMAMOS EN DOUBLE CON MAPTODOUBLE
        Y LUEGO SE SUMA CADA RESULTADO A UN TOTAL QUE ES EL QUE RETORNA
        */
        return lineasPedido.stream().mapToDouble(LineaPedido::getPrecioTotalBruto).sum();
    }

    //--SUMATORIO FILTRADO UNIDADES--
    public static double totalNetoMinUnidades(List<LineaPedido> lista, int minUnidades){
        return lista.stream().filter(lp -> lp.getUnidades() > minUnidades).mapToDouble(LineaPedido::getPrecioTotalBruto).sum();
    }

    //--DICCIONARIO  AGRUPA POR IVA - SUMA PRECIO
    //agrupamos por el tipo de iva, y luego sumamos esos productos
    public static Map<Integer,Double> totalBrutoPorIVA(int IVA){
        return lineasPedido.stream().collect(Collectors.groupingBy(LineaPedido::getTipoIVA,Collectors.summingDouble(LineaPedido::getPrecioTotalBruto)));
    }

    //USO DE OPTIONAL
    //como queremos que retorne un optional lo declaramos como return del metodo
    public static Optional<LineaPedido> lineaPedidoConMasUnidades(){
        //como queremos comparar objetos del mismo atributo, usamos el Comparator.comparing para comparar entre el numero de unidades
        return lineasPedido.stream().max(Comparator.comparing(LineaPedido::getUnidades));
    }

    //--MAP TIPO IVA DE TOTALNETO  -  TOTALNETO
    public static Map<Integer,Double> totalBrutoPorIVASuperiorAUmbral(double umbral){
          Map<Integer,Double> grupIVA = lineasPedido.stream().collect(Collectors.groupingBy(LineaPedido::getTipoIVA,Collectors.summingDouble(LineaPedido::getPrecioTotalNeto)));
          return grupIVA.entrySet().stream().filter(precio -> precio.getValue() > umbral).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}