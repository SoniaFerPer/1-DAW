import java.util.Scanner;

public class ejer16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        System.out.println(combinacionesPosibles(palabra));

    }
    public static int combinacionesPosibles(String cadena) {

        int combinaciones = 1;
        int contadorRepeticiones = 1;

        cadena += " "; //esto es para que lea el bloque de caracteres finales, porque si no hay un caracter que no queramos leer al final se saltará el ultimo grupo de letras

        for (int i = 1; i < cadena.length(); i++) {
            if (cadena.charAt(i) == cadena.charAt(i - 1)) {
                contadorRepeticiones++;
            } else {
                // si cambia el carácter, multiplicamos por el número de repeticiones que se habian echo hasta ese momento
                combinaciones *= contadorRepeticiones;
                //devolvemos el contador a 0 para volver a comprobar el siguiente caracter
                contadorRepeticiones = 1;
            }
        }

        return combinaciones;
    }
}
