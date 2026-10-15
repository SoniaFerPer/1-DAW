import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ejer2 {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {

        String cad1 = sc.nextLine().toUpperCase().trim();
        String cad2 = sc.nextLine().toUpperCase().trim();
        String cad3 = sc.nextLine().toUpperCase().trim();
        String cad4 = sc.nextLine().toUpperCase().trim();
        String cad5 = sc.nextLine().toUpperCase().trim();

        System.out.println(barajar(cad1));
        System.out.println(barajar(cad2));
        System.out.println(barajar(cad3));
        System.out.println(barajar(cad4));
        System.out.println(barajar(cad5));

    }

// Convertir String a array de chars
        public static String barajar(String cad){
            char[] letras = cad.toCharArray();

            for (int i = letras.length - 1; i > 0; i--) {
                int n = rand.nextInt(i + 1); // número aleatorio entre 0 e i

                // intercambiar letras[i] con letras[j]
                char aux = letras[i];
                letras[i] = letras[n];
                letras[n] = aux;
            }
            // Convertir el array mezclado a String
            return new String(letras);
        }
}

