import java.util.*;

public class list {
    public static void main(String[] args) {
        List<String> prueba1 = new LinkedList<>();
        prueba1.add("platano");
        prueba1.add("papaya");
        prueba1.add("fresa");
        prueba1.add("pera");
        prueba1.add("uva");

        //IMPRIMIR UN RESULTADO
        System.out.println(prueba1.get(2));

        //CAMBIAR UN ELEMENTO POR OTRO
        prueba1.set(1,"manzana");

        //ELIMINAR UN ELEMENTO
        prueba1.remove(4);

        //COMPROBAR SI EXISTE UN ELEMENTO
        System.out.println(prueba1.contains("uva"));

        //COMPROBAR SI LA LISTA ESTA VACIA
        System.out.println(prueba1.isEmpty()?"si":"no");

        //MUESTRA EL TAMAÑO DE LA LISTA
        System.out.println(prueba1.size());

        //BUSCAR POSICIONES
        System.out.println(prueba1.indexOf("fresa"));

        //BUSCAR ULTIMA POSICION DE UN ELEMENTO REPETIDO
        prueba1.add("fresa");
        System.out.println(prueba1.lastIndexOf("fresa"));

        //RECORRER LA LISTA
        for(String i : prueba1){
            System.out.println(i);
        }
        System.out.println();
        prueba1.forEach(System.out::println);

        //COPIA UNA LISTA EN UNA COLECCION
        Collection<String> pruebaCol = new ArrayList<>(prueba1);

        List<String> prueba2 = new ArrayList<>();
        prueba2.add("melocoton");
        prueba2.add("manzana");
        prueba2.add("fresa");
        prueba2.add("kiwi");

        //SOLO NOS QUEDAMOS CON LOS ELEMENTOS COMUNES DE AMBAS
        prueba2.retainAll(prueba1);
        prueba2.forEach(System.out::println);

        //COPIA TODO LO DE UNA LISTA A OTRA
        prueba2.addAll(prueba1);

        System.out.println();
        //DAR LA VUELTA PERO HAY QUE CREAR UNA NUEVA LISTA
        List<String> invertida = prueba2.reversed();
        invertida.forEach(System.out::println);

        //CON COLLECTIONS SI DA LA VUELTA
        Collections.reverse(prueba2);
        prueba2.forEach(System.out::println);

        //BORRA TODO LO QUE TENGA UNA LISTA EN OTRA
        prueba2.removeAll(prueba1);

        //ORDENAR ELEMENTOS
        Collections.sort(prueba2);

        //MEZCLAR ELEMENTOS
        Collections.shuffle(prueba2);
    }
}