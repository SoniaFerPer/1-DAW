import java.util.Scanner;

public class ejer10 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repetir = true;

        do{
            String cadena=sc.nextLine();
            System.out.println(sinVocales(cadena));

            System.out.println("¿Quieres introducir otra cadena? (s/n)");
            char repeticion=sc.next().charAt(0);
            sc.nextLine();

            if (repeticion == 'N' || repeticion == 'n') {
                repetir = false;
            } else if (repeticion == 'S' || repeticion == 's') {
                repetir = true;
            } else {
                System.out.println("Opción no válida. Por favor introduce 's' o 'n'.");
                repetir = true; // Continúa pidiendo
            }

        }while (repetir);



    }
    public static String sinVocales(String cadena) {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            String c = Character.toString(cadena.charAt(i));

            //si lo comparamos y añadimos al stringbuilder solo lo que no sea vocal
            if (!c.equals("A") && !c.equals("a") && !c.equals("E") && !c.equals("e") &&
                    !c.equals("I") && !c.equals("i") && !c.equals("O") && !c.equals("o") &&
                    !c.equals("U") && !c.equals("u")) {
                sb.append(c);
            }
        }
        return (sb.toString());

    }
}
