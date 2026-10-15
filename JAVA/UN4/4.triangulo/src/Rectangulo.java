public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        setAltura(altura);
        setBase(base);
    }

    public double calcularArea(){
        return base*altura;
    }

    public double calcularPerimetro(){
        return base * 2 + altura * 2;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if(base <= 0){
            throw new IllegalArgumentException("Medida no válida.");
        }
        this.base = base;
    }

    public void setAltura(double altura) {
        if(altura <= 0){
            throw new IllegalArgumentException("Medida no válida.");
        }
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}

