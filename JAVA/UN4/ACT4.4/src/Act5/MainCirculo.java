package Act5;


public class MainCirculo {
    public static void main(String[] args) {

        Circulo c1 = new Circulo(2.23);
        Circulo c2 = new Circulo(3.23);
        Circulo c3 = new Circulo(5.99);

        System.out.printf("%.2f\n",c1.calcularArea());
        System.out.printf("%.2f\n",c1.calcularLongitud());
        System.out.printf("%.2f\n",c2.calcularArea());
        System.out.printf("%.2f\n",c2.calcularLongitud());
        System.out.printf("%.2f\n",c3.calcularArea());
        System.out.printf("%.2f\n",c3.calcularLongitud());
    }
}