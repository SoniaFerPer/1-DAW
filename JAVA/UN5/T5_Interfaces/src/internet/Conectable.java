package internet;

public interface Conectable {
    boolean conectarWifi();
    boolean desconectarWifi();

    //metodo predetermindo = default, entiendo que va en la interfaz
    default void configurarPorDefecto() {
        System.out.println("Configuración estándar WiFi");
    }
}
