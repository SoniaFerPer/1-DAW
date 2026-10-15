import java.util.Scanner;

public class multiplicar {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Introduzca el numero: ");
        int numero=sc.nextInt();
        System.out.println("Tabla de multiplicar: ");
        for(int i=1;i<=10;i++){
            System.out.println(numero + " x " + i + " = " + numero * i);
        }

    }
}