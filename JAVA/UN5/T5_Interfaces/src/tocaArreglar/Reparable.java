package tocaArreglar;

public interface Reparable {

    void reparar();

    boolean verificarEstado();

    default void metodoReparacionEstandar(){
        if (verificarEstado() == true) {
            System.out.println("Necesita reparación.");
            reparar();
            notificarTecnico();
            //aqui entiendo que si esta mal tiene que llamar a reparar y al tecnico para que lo arregle pero no se si este sea la forma correcta de hacerlo
        } else {
            System.out.println("Está en buen estado.");
        }
    }

    default void notificarTecnico(){
        System.out.println("Llamando al técnico.");
    }
}
