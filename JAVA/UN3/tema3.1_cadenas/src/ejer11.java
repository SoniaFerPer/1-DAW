import java.util.Scanner;

public class ejer11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cadena=sc.nextLine();

        System.out.println(contandoLetras(cadena));

    }
    public static int contandoLetras(String cadena) {
        /*
        Primero con lastindexof buscamos el último espacio, y después con tostring cortamos
        para quedarnos con el resto de la frase desde el espacio.
        No olvidar sumarle uno. Por ultimo, sacamos la longitud de la ultima palabra.
         */
         int ultimoEspacio = cadena.lastIndexOf(" ");
         String ultimaPalabra=cadena.substring(0,ultimoEspacio+1);
         int longitud;

        return longitud = ultimaPalabra.length();
    }
}
