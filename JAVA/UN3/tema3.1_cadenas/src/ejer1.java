import java.util.Scanner;


public class ejer1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String cad;
        System.out.print("Escriba una frase: ");
        do{
            cad = sc.nextLine();
            for(int i = 0; i<cad.length();i++) {
                String letra = String.valueOf(cad.charAt(i));
                if (letra.equals(letra.toLowerCase())) {
                    System.out.print(letra.toUpperCase());
                } else {
                    System.out.print(letra.toLowerCase());
                }

            }
            System.out.println();

        }while (!cad.equalsIgnoreCase("FINAL"));


        /*
        valueOf sirve para convertir un char en un String.
        String letra = String.valueOf(cad.charAt(i));

        Otras formas:
            // Opción 2 Character.toString()
            String s3 = Character.toString(cad.charAt(i));

            // Opción 3: substring
            String s4 = cad.substring(i, i+1);
         */



    }
}