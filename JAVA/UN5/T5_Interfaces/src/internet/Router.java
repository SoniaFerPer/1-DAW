package internet;

public class Router implements Conectable, Actualizable {
    private boolean encendido = false;

    public boolean isEncendido() { return encendido;}
    public void setEncendido(boolean encendido) { this.encendido = encendido;}

    @Override
    public boolean conectarWifi() {
        return encendido = true;
    }

    @Override
    public boolean desconectarWifi() {
        return encendido = false;
    }

    @Override
    public void buscarActualizaciones() {
    }
    //¿los metodos por defecto no hace falta implementarlos, no?

    }
