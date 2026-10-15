import java.util.Scanner;

public class parOimpar {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Escribe un numero entero: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.print("El numero es par");

        } else
            System.out.print("El numero es impar");

        sc.close();

    }
}
