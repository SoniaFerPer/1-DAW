import java.util.Scanner;

public class ejerContandoNumeros {
    public static void main(String[] args) {
        int[] contador = new int[10]; // Posiciones 0..9
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 5 números enteros:");

        //cuando vayamos introduciendo numeros,  va contando dentro de un array la unidad a la que
        // pertenece, si metes un 50 como es 0 va en la posicion 1 pero indice 0, si metemos un 43 va en la posicion 4 pero indice 3
        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt(); //53, 42,63,72,44

            int ultimo = n % 10;   // Obtiene el último dígito del número, la unidad
            contador[ultimo]++;    // Suma 1 al cajón correspondiente, esto es igual a i=i+1

            System.out.println("El último dígito de " + n + " es " + ultimo);
            System.out.println("contador[" + ultimo + "] ahora vale " + contador[ultimo]);
            System.out.println();
        }

        System.out.println("Resumen final:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Números que acaban en " + i + ": " + contador[i]);
        }

    }
}
