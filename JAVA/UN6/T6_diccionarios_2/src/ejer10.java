import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,String> sistema = new HashMap<>();
        sistema.put("26250932C","Sonia");
        sistema.put("26534532L","Maria");
        sistema.put("25454932C","Amelia");
        sistema.put("26234332C","Yolanda");
        sistema.put("24667336S","Jose");
        sistema.put("26246573G","Luis");
        sistema.put("26968353V","Adrian");
        sistema.put("26268475D","Teresa");
        sistema.put("26235464L","Ari");
        sistema.put("22446857F","Zaida");

        while(true){
            System.out.println("buscar clave o valor");
            String eleccion = sc.next();
            sc.nextLine();
            if(eleccion.equals("FIN")) break;
            System.out.println("Palabra a buscar: ");
            String busqueda = sc.nextLine().trim();
            String resultado;
            if(eleccion.equals("clave")){
                resultado = getClave(sistema,busqueda);
                System.out.println(resultado != null ? resultado : "No encontrado");
            }else if (eleccion.equals("valor")){
                resultado = getValor(sistema,busqueda);
                System.out.println(resultado != null ? resultado : "No encontrado");
            }
        }

    }
    // Buscar clave (DNI) a partir del nombre
    public static String getClave(Map<String,String> mapa, String valor){
        for (Map.Entry<String,String> entry : mapa.entrySet()) {
            if(entry.getValue().equalsIgnoreCase(valor)){
                return entry.getKey();
            }
        }
        return null;
    }

    // Buscar valor (nombre) a partir del DNI
    public static String getValor(Map<String,String> mapa, String clave){
        return mapa.get(clave);
    }
}