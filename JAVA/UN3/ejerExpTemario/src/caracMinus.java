import java.util.Scanner;

public class caracMinus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String cad=sc.nextLine();
        boolean prueba = cad.matches("[a-z]+");
        System.out.println(prueba);


    }
}