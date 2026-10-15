import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena=sc.nextLine();

        boolean eleccion = cadena.matches("0[1-9]\\d{5}");

        System.out.println(eleccion);


    }
}
