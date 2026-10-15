
public class Main {
    public static void main(String[] args) {
    Triangulo c1 = new Triangulo(5,7);

    //c1.setAltura(-3);

    System.out.printf("El area del triangulo es %.1f.\n",c1.calcularArea());

    Rectangulo r1 = new Rectangulo(5,3);


    System.out.printf("El area del rectángulo es %.1f.\n",r1.calcularArea());
    System.out.printf("El perimetro del rectángulo es %.1f.\n",r1.calcularPerimetro());



    }
}