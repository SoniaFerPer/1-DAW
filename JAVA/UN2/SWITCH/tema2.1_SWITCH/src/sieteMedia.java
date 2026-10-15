import java.util.Scanner;

public class sieteMedia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("¡Vamos a jugar a las siete y media. Tienes que introducir el valor de tres cartas.");

        System.out.print("Introduzca el valor de la primera carta: ");
        double card1 = valor((int)sc.nextDouble());

        System.out.print("Introduzca el valor de la segunda carta: ");
        double card2 =valor((int)sc.nextDouble());

        System.out.print("Introduzca el valor de la tercera carta: ");
        double card3 = valor((int)sc.nextDouble());

        if(resultado(card1,card2,card3) == 7.5){
            System.out.println("Ganas la partida.");
        }else if (resultado(card1,card2,card3) < 7.5){
            System.out.println("Te has quedado corto.");
        }else{
            System.out.println("Has perdido porque te has pasado.");
        }

    }

    public static double valor(int numero) {
        switch (numero){
            case 1:
                return 1.0;
            case 2:
                return 2.0;
            case 3:
                return 3.0;
            case 4:
                return 4.0;
            case 5:
                return 5.0;
            case 6:
                return 6.0;
            case 7:
                return 7.0;
            case 10:
            case 11:
            case 12:
                return 0.5;
            default:
                return  0;
        }
    }

    public static double resultado (double card1, double card2, double card3){
        return card1 + card2 + card3;
    }
}
