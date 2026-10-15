import java.util.Scanner;

public class triangulos {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer ángulo del triángulo: ");
        int grado1 = sc.nextInt();

        System.out.print("Introduce el segundo ángulo del triángulo: ");
        int grado2 = sc.nextInt();

        System.out.print("Introduce el tercer ángulo del triángulo: ");
        int grado3 = sc.nextInt();

        if(grado1 + grado2 + grado3 > 180){
            System.out.println("No puede ser un triangulo.");

        }else if(grado1 < 90 && grado2 < 90 && grado3 < 90){
            System.out.println("El triangulo es acutángulo.");

        }else  if(grado1 == 90 || grado2 == 90 || grado3 == 90){
            System.out.println("El triangulo es rectángulo.");

        }else {
            System.out.println("El triangulo es obtusángulo.");
        }
    }
}
