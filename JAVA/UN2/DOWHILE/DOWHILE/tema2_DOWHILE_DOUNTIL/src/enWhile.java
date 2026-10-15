import java.util.Scanner;

public class enWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int numero =sc.nextInt();

        System.out.println("TABLA DE MULTIPLICAR: ");
        int contador = -1;

        while (contador < 10){
            contador++;
            System.out.println(numero + " x " + contador + " = " + numero * contador);

        }
    }
}
