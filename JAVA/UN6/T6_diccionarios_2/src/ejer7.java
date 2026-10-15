import java.util.*;

public class ejer7 {
    public static void main(String[] args) {
        /*
        ALTERNATIVA SIN CONVERTIR A LISTA
        porLetras.entrySet().stream()
        .sorted(Map.Entry.comparingByKey())
        .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
         */
        Map<String,Integer> corredores = new HashMap<>();

        //TRANSFORMAMOS UN MAP EN UNA LISTA
        List<Map.Entry<String,Integer>> podium = new ArrayList<>(corredores.entrySet());

        //ORDENAR POR VALOR
        podium.sort(Map.Entry.comparingByValue());

        //ORDENAR POR CLAVE
        //podium.sort(Map.Entry.comparingByKey());

        //MOSTRAR SOLO LOS TRES PRIMEROS
        int contador = 0;
        for (Map.Entry<String, Integer> entry : podium) {
            if (contador == 3) break;
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            contador++;
        }
    }
}