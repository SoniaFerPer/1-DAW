import java.util.Scanner;

public class notaAmericanVer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero: ");
        double num = sc.nextDouble();
        char calificacion= 0;

        switch ((int) num){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                calificacion = 'E';
            case 10:
            case 11:
            case 12:
                calificacion = 'D';
            case 13:
            case 14:
            case 15:
                calificacion = 'C';
            case 16:
            case 17:
            case 18:
                calificacion = 'B';
            case 19:
            case 20:
                calificacion = 'A';

        }
            System.out.println("Tu calificación es " + calificacion);



    }
}
