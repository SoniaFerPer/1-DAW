import java.util.Scanner;

public class ejer14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dni = sc.nextLine();

        if (dniValido(dni)) {
            if (esChulo(dni)) {
                System.out.println("El NIF es válido y chulo");
            } else {
                System.out.println("El NIF es válido pero no es chulo");
            }
        } else {
            System.out.println("El NIF no es válido");
        }
    }

    public static boolean dniValido(String dni) {
        // Verificar formato básico (8 dígitos + 1 letra)
        if (dni == null || dni.length() != 9) {
            return false;
        }

        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        //hay que poner un try catch por si se mete mas letras de 1
        try {
            String numeroStr = dni.substring(0, 8);
            char letra = Character.toUpperCase(dni.charAt(8));
            int numero = Integer.parseInt(numeroStr);

            // Verificar que la letra es correcta
            int resto = numero % 23;
            return letras.charAt(resto) == letra;

        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean esChulo(String dni) {
        String numeroStr = dni.substring(0, 8);

        // Verificar que no tiene dígitos repetidos
        for (int i = 0; i < 8; i++) {
            char c = numeroStr.charAt(i);
            if (numeroStr.indexOf(c) != numeroStr.lastIndexOf(c)) {
                return false;
            }
        }

        return true;
    }
}


