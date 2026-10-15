import java.util.*;

public class map {
    public static void main(String[] args) {
        Map<Integer,String> prueba = new TreeMap<>();
        Map<String,Integer> prueba2 = new HashMap<>();

        //AÑADIR K - V
       prueba.put(1,"rojo");
       prueba.put(2,"azul");
       prueba.put(3,"verde");
       prueba2.put("lado",345);
       prueba2.put("altura",655);

       //IMPRIMIR UN V A PARTIR DE UNA K
        System.out.println(prueba.get(1));

        //ELIMINAR CLAVE
        prueba.remove(3);

        //COMPROBAR SI EXISTE UNA CLAVE
        System.out.println(prueba.containsKey(3));

        //COMPROBAR SI EXISTE UN VALOR
        System.out.println(prueba.containsValue("rojo"));

        //TAMAÑO MAP
        System.out.println(prueba.size());

        //COMPROBAR SI EXISTE VALOR Y SINO MENSAJE
        System.out.println(prueba.getOrDefault(3,"no existe"));

        //SI NO EXISTE INSERTA Y SI EXISTE NO LO SOBREESCRIBE
        prueba.putIfAbsent(1,"verde");
        System.out.println(prueba.get(1));

        //MOSTRAR VALORES MAPA
        for(String g: prueba.values()){
            System.out.println(g);
        }

        //MOSTRAR CLAVES MAPA
        for(Integer i: prueba.keySet()){
            System.out.println(i);
        }

        //SI LA CLAVE NO EXISTE LA CREA, SINO NO HACE NADA
        prueba.computeIfAbsent(3,v-> "verde");
        System.out.println(prueba);

        //ACTUALIZAR VALORES O SUMARLOS
        prueba.merge(1,"rojo",(v1,v2)->v1+" "+"granate");
        System.out.println(prueba);

        //SUMAR UN NUMERO A UN VALOR NUMERICO
        prueba2.merge("lado",345,Integer::sum);
        System.out.println(prueba2);

        //RECORRER UN MAP
        for(Map.Entry<String,Integer> j : prueba2.entrySet()){
            System.out.println(j.getKey() + " - " + j.getValue());
        }

        //CLONAR UN MAP (LA MEJOR FORMA)
        Map<String,Integer> copia = new HashMap<>(prueba2);
        System.out.println(copia);

        System.out.println();
        //TRANSFORMAR UN MAP A UN SET
        Set<String> convertir = new HashSet<>(prueba.values());
        convertir.forEach(System.out::println);

        //BORRAR UN MAP
        prueba2.clear();
    }
}