import java.util.Scanner;

public class ordenandoGerundio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un numero entero: ");
        int num1 = sc.nextInt();
        System.out.println("Escriba otro numero entero");
        int num2 = sc.nextInt();

        if(num1<num2){
            System.out.println(num1 + "\n" + num2);
            }else if(num1>num2){
                System.out.println(num2 + "\n" + num1);
        }else {
            System.out.println(num1 + "\n" + num2);
        }

    }
}
