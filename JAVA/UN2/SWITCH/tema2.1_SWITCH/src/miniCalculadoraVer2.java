import java.util.Scanner;

public class miniCalculadoraVer2 {
    public static void main(String[] args) {

        //VERSION CON STRING EN VEZ DE CHAR

        int resultado=0, num1, num2;
        String operacion;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        num1 = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        num2 = sc.nextInt();

        System.out.print("Introduce una operación(SUMA,RESTA,MULTIPLICACIÓN,DIVISION): ");
        operacion = sc.next();




        switch (operacion) {
            case "SUMA":
                resultado = num1 + num2;
                break;
            case "RESTA":
                resultado = num1 - num2;
                break;
            case "MULTIPLICACIÓN":
                resultado = num1 * num2;
                break;
            case "DIVISION":
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operación no valida");
                break;
        }
        System.out.println("El resultado es: " + resultado);
    }
}
