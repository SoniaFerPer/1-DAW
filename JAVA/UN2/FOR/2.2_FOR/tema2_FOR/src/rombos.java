import java.util.Scanner;

public class rombos {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el número de asteriscos: ");
        n=sc.nextInt();

        //esto hace un triangulo rectangulo
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {  //SE LE RESTA AL NUM -1 PARA DARLE ESPACIOS EN VEZ DE ASTERISCOS Y ASI SALGA UNA PIRAMIDE
                System.out.print(' ');
            }
            for (j = 1; j <= 2 * i - 1; j++) { //MULTIPLICAMOS LA I POR DOS PARA MULTIPLICAR LOS ASTERISCOS Y -1 PARA ESPACIOS
                System.out.print('*');
            }
            System.out.println();
        }
        //ahora hay que hacer la inversa del for para el triangulo inverso y que haga el rombo

        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
