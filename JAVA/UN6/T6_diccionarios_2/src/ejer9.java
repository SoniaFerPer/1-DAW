import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class ejer9 {
    public static void main(String[] args) {
        // Mapa 1: Configuración base (por defecto) del sistema
        Map<String, String> configBase = new HashMap<>();
        configBase.put("url", "http://localhost:8080");
        configBase.put("timeout", "3000");
        configBase.put("idioma", "en_EN");
        configBase.put(null, "Esto es un error del sistema que debemos ignorar"); // Clave null
        configBase.put("tema", null); // Valor null

        // Mapa 2: Configuración personalizada del usuario (la que vamos a comparar)
        Map<String, String> configUsuario = new HashMap<>();
        configUsuario.put("timeout", "5000"); // Va a sobrescribir al 3000 de la configBase
        configUsuario.put("idioma", "es_ES"); // Va a sobrescribir al en_EN
        configUsuario.put("modo_oscuro", "activado");
        configUsuario.put("url", null); // El usuario ha roto la URL, pondrá un null que luego borraremos


        // Usamos TreeMap para ordenar A-Z por clave
        Map<String, String> configFinal = new TreeMap<>();


        // El orden aquí es MUY IMPORTANTE. Primero metemos la configuración base.
        agregarConfiguracionSegura(configFinal, configBase);

        // Luego metemos la configuración del usuario.
        // Como va en segundo lugar, sus valores sobrescribirán a los de la base si coinciden los parámetros.
        agregarConfiguracionSegura(configFinal, configUsuario);


        // El enunciado pide: "Si el valor del parámetro es null, elimínalo del tercer mapa usando removeIf"
        // La interfaz Map NO tiene el metodo removeIf().
        // Pero sus vistas values() o entrySet() SÍ lo tienen porque son Colecciones

        // Extraemos solo los valores del mapa y le aplicamos el removeIf
        // Si borramos un valor de esta vista, automáticamente desaparece toda la pareja (clave-valor) del mapa original.
        configFinal.values().removeIf(valor -> valor == null);
        System.out.println("=== CONFIGURACIÓN FINAL DEL SISTEMA ===");
        configFinal.forEach((parametro, valor) -> {
            System.out.println("- " + parametro + " : " + valor);
        });
    }

    /**
     * Este metodo copia los datos de un mapa de origen a uno de destino,
     * pero bloqueando el paso a cualquier entrada que tenga una clave null.
     */
    public static void agregarConfiguracionSegura(Map<String, String> destino, Map<String, String> origen) {
        // Recorremos el mapa de origen usando entrySet() para ver tanto la clave como el valor
        for (Map.Entry<String, String> entrada : origen.entrySet()) {

            // Filtro de seguridad: Solo pasamos si la CLAVE NO es nula
            if (entrada.getKey() != null) {
                // Al hacer put(), si la clave ya existe en el destino, se sobrescribe con el nuevo valor.
                // Esto nos soluciona automáticamente el requisito de "prevalece el valor del segundo mapa".
                destino.put(entrada.getKey(), entrada.getValue());
            }
        }
    }
}