import java.util.Scanner;

public class dominoVer2 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.println("Di el primer extremo de la primera ficha: ");
        int ex1ficha1=sca.nextInt();
        System.out.println("Di el segundo extremo de la primera ficha: ");
        int ex2ficha1=sca.nextInt();
        System.out.println("Di el primer extremo de la segunda ficha: ");
        int ex1ficha2=sca.nextInt();
        System.out.println("Di el segundo extremo de la segunda ficha: ");
        int ex2ficha2=sca.nextInt();

        String resultado = (ex1ficha1 < 1 || ex1ficha1 > 6 || (ex2ficha1 < 1 || ex2ficha1 > 6) ||
                (ex1ficha2 < 1 || ex1ficha2 > 6) || (ex2ficha2 < 1 || ex2ficha2 > 6)? "Numero de ficha no válida.":
                (ex1ficha1 == ex1ficha2) || (ex1ficha1 == ex2ficha2) || (ex2ficha1 == ex1ficha2) || (ex2ficha1 == ex2ficha2) ? "Las fichas pueden conectarse." : "Las fichas no pueden conectarse.");

        System.out.println(resultado);
    }
}

