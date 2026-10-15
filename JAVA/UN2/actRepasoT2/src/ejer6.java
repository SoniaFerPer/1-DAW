import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Dime un numero: ");
        num = sc.nextInt();
        sc.nextLine();

        /*
        CLARO COÑOOO, SI USAMOS EL I EN VEZ DE NUM Y VEMOS SI EL I CUANDO VA CORRIENDO
        EL BUCLE ES IMPAR O PAR TE IMPRIME UNO U OTRO CARACTER.
        I=0 ENTONCES - PORQUE ES PAR/  I=1 ENTONCES = PORQUE ES IMPAR
        Y LO HACE MIENTRAS I SEA MENOR A NUM. CUANDO EL FOR HAGA LA COMPROBACION DE
        I= 5 Y NUM=5 ENTONCES NO HACE EL BUCLE PORQUE YA NO ES MENOR A NUM.
        COMO EMPIEZA I EN 0 LO HACE 5 VECES 0,1,2,3,4 Y AL 5 SE SALE.
         */

        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                System.out.print("-");
            } else {
                System.out.print("=");
            }
        }
        sc.close();

    }
}
