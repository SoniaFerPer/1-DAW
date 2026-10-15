import java.util.Scanner;

public class ejer11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado,ancho;
        System.out.print("Dime el lado: ");
        lado = sc.nextInt();
        System.out.print("Dime el ancho: ");
        ancho = sc.nextInt();

        for(int i = 1; i <= lado; i++) {
            for (int j = 1; j <= ancho; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
