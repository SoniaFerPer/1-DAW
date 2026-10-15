import java.util.Scanner;

public class validarNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cad = sc.nextLine();
        System.out.println(cad.matches("[a-z][a-z\\d]{2,9}"));


    }
}
