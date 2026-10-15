import java.util.Scanner;

public class enDoUntil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int numero =sc.nextInt();

        System.out.println("TABLA DE MULTIPLICAR: ");
        int contador = 1;

        do {
            System.out.println(numero + " x " + contador + " = " + numero * contador);
            contador++;

        }while (contador != 11);  //(contador < 11)

    }

}
