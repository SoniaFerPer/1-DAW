import java.util.*;

public class Provincias {
    private static Map<String, Map<List<String>,Integer>> tabla = new TreeMap<>();
    private static List<String> provincias;

    for(String p: Arrays.asList("AL","CA","CO","GR","HU","JA","MA","SE")){
            provincias = new ArrayList<>(tabla.keySet());
    };

    public static void proxima(String provincia){
        Map<String,Integer> destinos = tabla.get(provincia);
        if(destinos == null) return null;
    }

    public static void distancia(String origen, String destino){

    }


}
