import java.util.Scanner;

public class esPrimo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Dime un numero: ");
        int num= sc.nextInt();

        //Un número primo es un número natural mayor que 1 que solo tiene dos divisores: la unidad (1) y él mismo.
        // Esto significa que no puede dividirse de manera exacta (sin dejar residuo) por ningún otro número aparte de 1 y sí mismo.
        // Ejemplos de números primos son 2, 3, 5, 7, 11 y 13.


        if (num == 2 || num == 3 || num == 5 || num == 7) {
            System.out.println("Es un número primo.");
        }else if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0 ){
            System.out.println("No es un número primo.");
        }
        else System.out.println("Es un número primo.");



    }
}
