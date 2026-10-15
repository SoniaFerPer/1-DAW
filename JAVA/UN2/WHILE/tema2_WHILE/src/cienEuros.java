import java.util.Scanner;

public class cienEuros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿cuanto vas a pagar?: ");
        int pago = sc.nextInt();
        while (pago < 100){
            System.out.print("Todavia falta:");
            int pago2= sc.nextInt();
            pago+=pago2;
            if(pago>100){
                int devolucion = pago - 100;
                System.out.println("Tengo que devolverte " + devolucion + " euros.");
            }

        }
    }
}
