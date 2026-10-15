import java.util.Scanner;

public class segundoGrado {
    public static void main(String[] args) {
       double resultado1, resultado2;

       Scanner sc = new Scanner(System.in);

       System.out.println("valor de a: ");
       double a = sc.nextDouble();

       System.out.println("valor de b: ");
       double b = sc.nextDouble();

       System.out.println("valor de c: ");
       double c = sc.nextDouble();

       double discriminante = Math.pow(b,2) - 4 * a * c;


       if (discriminante>0){
           System.out.println("La ecuación tiene dos soluciones distintas: ");
           resultado1 = (-b + Math.sqrt(discriminante)) / (2 * a);
           resultado2 = (-b - Math.sqrt(discriminante)) / (2 * a);
           System.out.println("Primer resultado: " + resultado1);
           System.out.println("Segundo resultado: " + resultado2);
       }else if (discriminante == 0){
                resultado1 = -b / (2 * a);
                System.out.println("La ecuación tiene una única solución (raíz doble): " + resultado1);
       }else {
           System.out.println("No existe una solución real.");
       }

       sc.close();
    }
}
