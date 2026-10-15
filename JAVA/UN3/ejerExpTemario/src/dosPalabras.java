import java.util.Scanner;

public class dosPalabras {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String cad=sc.nextLine();
        System.out.println(cad.matches("\\w+\\s\\w+"));
    }
}
