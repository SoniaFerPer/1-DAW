package CosasQueSuenan;

public abstract class AltavozBluetooth implements EmisorAudio{

    private int volumen;
    private boolean encendido = false;

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        if (volumen >= 0 && volumen <= 100) {
            this.volumen = volumen;
        }
    }
    @Override
    public boolean encender() {
        return encendido = true;
    }

    @Override
    public boolean apagar() {
        return encendido = false;
    }

    @Override
    public void subirVolumen() {
        if (encendido && volumen < 100) {
            volumen++;
        }
    }

    @Override
    public void bajarVolumen() {
        if (encendido && volumen > 0) {
            volumen--;
        }
    }

}
