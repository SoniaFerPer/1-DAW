import java.util.Scanner;

public class sinNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cad = sc.nextLine();
        System.out.println(cad.matches("\\D+"));

        System.out.println(cad.matches("[^0-9]+"));


    }
}
