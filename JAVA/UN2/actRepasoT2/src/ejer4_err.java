import java.util.Scanner;

public class ejer4_err {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorA = 0, contadorB = 0;
        boolean terminar = false;
        char jugador;
        while (!terminar) {
            System.out.println("Juego: " + contadorA + "-" + contadorB);
            System.out.print("¿Quién anota? A o B:");
            jugador = sc.next().toUpperCase().charAt(0);

            if(jugador == 'A' ){
                contadorA = contadorA + 15;
            }else if(jugador == 'B' ){
                contadorB = contadorB + 15;
            }else{
                System.out.println("Error, entrada no valida.");
            }

            if (contadorA >= 40) {
                contadorA = contadorA - 5;
                System.out.println("Juego: " + contadorA + "-" + contadorB);
                System.out.println("¡Juego para el jugador A!");
                terminar = true;
            }else if (contadorB >= 40 ) {
                //ESTO SEGURO ES TRAMPA PARA ARREGLARLO :(
                contadorA = contadorA - 5;
                System.out.println("Juego: " + contadorA + "-" + contadorB);
                System.out.println("¡Juego para el jugador B!");
                terminar = true;
            }

        }
//        NO SE HACER EL DOUCE!!!!
//        while(contadorA >= 40 && contadorB >= 40) {
//            System.out.println("Douce!");
//
//            if (contadorB >= 40 && contadorA == 40) {
//                System.out.print("El jugador A tiene la ventaja");
//            } else if (contadorA >= 40 && contadorB == 40) {
//                System.out.print("El jugador B tiene la ventaja");
//            }
//        }
        sc.close();


    }
}
