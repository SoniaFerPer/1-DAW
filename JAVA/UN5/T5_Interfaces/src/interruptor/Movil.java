package interruptor;

public class Movil implements Encendible {

    @Override
    public boolean apagar() {
        return false;
    }

    @Override
    public boolean encender(){
        return true;
    }
}

