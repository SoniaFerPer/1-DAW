import java.util.HashMap;
import java.util.Map;

public class ejer2 {
    public static void main(String[] args) {
        Map<String,Integer> productos = new HashMap<>();
        productos.put("crema",4);
        productos.put("boli", 10);
        productos.put("pañuelo",5);
        productos.forEach((clave,valor)->{System.out.println(clave + " " + valor);});

        productos.put("crema", 3);
        productos.forEach((clave,valor)->{System.out.println(clave + " " + valor);});
    }
}