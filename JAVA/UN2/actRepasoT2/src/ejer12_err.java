import java.util.Scanner;

public class ejer12_err {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado,ancho;
        System.out.print("Dime el lado: ");
        lado = sc.nextInt();
        System.out.print("Dime el ancho: ");
        ancho = sc.nextInt();


        for(int i = 0; i < lado; i++) {
            for (int j = 0; j < ancho-1; j++) {
                if(i %2 == 0) {
                    System.out.println("*");
                }else if((j + i) % 2 == 0 ) {
                    System.out.print(" ");
                }

                System.out.println("*");

            }
            System.out.println();

        }
    }
}
