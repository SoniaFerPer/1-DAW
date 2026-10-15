import java.util.Scanner;

public class recuperacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Calificación del tema 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Calificación del tema 2: ");
        double nota2 = sc.nextDouble();

        System.out.print("Calificación del tema 3: ");
        double nota3 = sc.nextDouble();

        if(nota1 < 5){
            System.out.println("Tendra que recuperar el tema 1.");

        } if (nota2 < 5) {
            System.out.println("Tendra que recuperar el tema 2.");

        }if (nota3 < 5) {
            System.out.println("Tendra que recuperar el tema 3.");

        }
    sc.close();


    }
}