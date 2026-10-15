import java.util.Scanner;

public class ejer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();

        System.out.println(maxBloque(texto));
    }
    public static int maxBloque(String cadena) {

        int maxLongitud = 1;
        int longitudActual = 1;

        for (int i = 1; i < cadena.length(); i++) {
            if (cadena.charAt(i) == cadena.charAt(i - 1)) {
                longitudActual++;
                maxLongitud = Math.max(maxLongitud, longitudActual);
            } else {
                longitudActual = 1;
            }
        }

        return maxLongitud;
    }
}
