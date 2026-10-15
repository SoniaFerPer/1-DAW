package abstraccion;

public class Main {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(22,25);
        Cuadrado c1 = new Cuadrado(4);
        System.out.println(r1.calcularArea());
        System.out.println(c1.calcularArea());
    }
}
