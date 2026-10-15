import java.util.Scanner;

public class multiplos13 {
    public static void main(String[] args) {
//        int multiplo = 0;
//        int n = 13;
//        System.out.println("multiplos de 13: ");
//        for (int i = 0; i * n <= 200; i++) {
//            multiplo = i * n;
//            System.out.println(multiplo);
//        }

        int n;
        for (n = 13; n <= 200; n += 13) {
            System.out.print(n + " ");
        }

    }
}