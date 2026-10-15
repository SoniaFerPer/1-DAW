import java.util.Scanner;

public class cienEurosLegal {

    static Scanner sc = new Scanner(System.in);

    public  static void main(String[] args) {

        double restante = 100.0;

        while (restante > 0) {
            System.out.println("¿cuanto me das?: ");
            double dinero = monedaLegal();
            restante -= dinero;

            if (restante < 0) {
                System.out.println("Aún quedan " + restante);
            }
        }
        System.out.println("Es suficiente");
        System.out.println("El cambio es " + (-restante));
    }


        public static double monedaLegal() {
            boolean valido = false;
            double moneda = 0.0;
            while (!valido) {
                moneda = sc.nextDouble();
                if (moneda == 500 || moneda == 200 || moneda == 100 || moneda == 50
                        || moneda == 20 || moneda == 10 || moneda == 5 || moneda == 2
                        || moneda == 1 || moneda == 0.50 || moneda == 0.20 || moneda == 0.10
                        || moneda == 0.05 || moneda == 0.02 || moneda == 0.01) {
                    valido = true;
                } else {
                    System.out.println("No es un billete o moneda valida. ");
                }

            }
            return moneda;

        }
    }
