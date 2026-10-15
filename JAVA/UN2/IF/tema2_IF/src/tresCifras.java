import java.util.Scanner;

public class tresCifras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unidades, centenas, num;

        System.out.println("Ingrese un número de tres cifras( rellene con 0 a la izquierda si es un número de menos de 3 cifras: ");
        num = sc.nextInt();

        unidades = num % 10;
        centenas = num / 100;

        if ((num < 0) || (num > 999)) {
            System.out.println("Numero no válido. Tiene que tener tres cifras.");
        } else if (unidades == centenas) {
            System.out.println("El número es capicúa.");
        }else{
            System.out.println("El número no es capicúa.");
        }
    }
}
