public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
       setBase(base); //llamamos a los setters con sus excepciones para no tener que repetir las excepciones
       setAltura(altura);

    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        if(base <= 0){
            throw new IllegalArgumentException("Medida no válida.");
        }
        this.base = base;

    }

    public void setAltura(double altura) {
        if(altura <= 0) {
            throw new RuntimeException("Medida no válida.");
        }
        this.altura = altura;
    }

    public double calcularArea(){
        return (base*altura)/2;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
