import java.util.Scanner;

public class miniCalculadora {
    public static void main(String[] args) {

        int resultado=0, num1, num2;
        char operacion;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        num1 = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        num2 = sc.nextInt();

        System.out.print("Introduce una operacion: ");
        operacion = sc.next().charAt(0);

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                 resultado = num1 / num2;
                 break;
            default:
                 System.out.println("Operación no valida");
                 break;
        }
        System.out.println("El resultado es: " + resultado);




    }
}
