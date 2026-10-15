package Act5;

public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea(){
        return Math.PI * Math.pow(getRadio(),2);
    }

    public double calcularLongitud(){
        return 2 * Math.PI * getRadio();
    }

}
