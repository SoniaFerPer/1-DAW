import java.util.*;

public class ejer6 {
    public static void main(String[] args) {
    List<String> frutas = new ArrayList<>(List.of("uva","Manzana","Pera","Manzana","Plátano","Pera","Melocotón","fresa"));

    Map<Integer,List<String>> porLetras = new HashMap<>();
        for (String palabra : frutas) {
            int longitud = palabra.length();

            // Si no existe la clave, la creamos
            if (!porLetras.containsKey(longitud)) {
               porLetras.put(longitud, new ArrayList<>());
            }

            // Añadimos la palabra a su lista correspondiente
            porLetras.get(longitud).add(palabra);
        }
        //IMPRIMIMOS AQUELLS QUE SEAN MAYOR DE 5
        for (Map.Entry<Integer, List<String>> entry : porLetras.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println(entry.getValue());
            }
        }

    }
}