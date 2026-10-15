import java.util.Scanner;

public class codProd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cad = sc.nextLine();
        System.out.println(cad.matches("[A-Z]*\\d{3}"));
    }
}
