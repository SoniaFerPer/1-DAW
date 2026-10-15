package interruptor;

public class Lampara implements Encendible {

    @Override
    public boolean apagar() {
        return false;
    }

    @Override
    public boolean encender(){
        return true;
    }
}

