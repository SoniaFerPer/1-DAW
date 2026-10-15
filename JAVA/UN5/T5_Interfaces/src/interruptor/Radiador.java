package interruptor;

public class Radiador implements Encendible {


    @Override
    public boolean apagar() {
        return false;
    }

    @Override
    public boolean encender(){
        return true;
    }
}
