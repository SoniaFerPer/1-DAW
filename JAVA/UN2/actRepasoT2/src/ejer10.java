import java.util.Scanner;

public class ejer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Dime un numero impar: ");
        num = sc.nextInt();
        int altura = (num + 1 ) / 2;

        if(num%2==0){
            throw new ArithmeticException("Tiene que ser un numero impar.");
        }

        sc.nextLine();

        for(int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
