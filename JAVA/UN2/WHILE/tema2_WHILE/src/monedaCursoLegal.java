import java.util.Scanner;

public class monedaCursoLegal {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double resultado = monedaLegal();

        System.out.println(resultado + " es una moneda válida.");
    }

    public static double monedaLegal() {
        boolean valido = false;
        double moneda = 0.0;
        while(!valido) {
            System.out.println("Ingrese billete o moneda: ");
            moneda = sc.nextDouble();
            if (moneda == 500 || moneda == 200 || moneda == 100 || moneda == 50
                    || moneda == 20 || moneda == 10 || moneda == 5 || moneda == 2
                    || moneda == 1 || moneda == 0.50 || moneda == 0.20 || moneda == 0.10
                    || moneda == 0.05 || moneda == 0.02 || moneda == 0.01) {
                valido = true;
            }else  {
                System.out.println("No es un billete o moneda valida. ");
            }

        }
        return moneda;

    }
}
