import java.util.Scanner;

public class domino {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Di el primer extremo de la primera ficha: ");
        int ex1ficha1=sc.nextInt();
        System.out.println("Di el segundo extremo de la primera ficha: ");
        int ex2ficha1=sc.nextInt();
        System.out.println("Di el primer extremo de la segunda ficha: ");
        int ex1ficha2=sc.nextInt();
        System.out.println("Di el segundo extremo de la segunda ficha: ");
        int ex2ficha2=sc.nextInt();

        if((ex1ficha1 < 1 || ex1ficha1 > 6) || (ex2ficha1 < 1 || ex2ficha1 > 6) || (ex1ficha2 < 1 || ex1ficha2 > 6) || (ex2ficha2 < 1 || ex2ficha2 > 6)) {
            System.out.println("Numero de ficha no válida.");

        }else if((ex1ficha1 == ex1ficha2) || (ex1ficha1 == ex2ficha2) || (ex2ficha1 == ex1ficha2) || (ex2ficha1 == ex2ficha2) ) {
            System.out.println("Las fichas pueden conectarse.");

        }else{
            System.out.println("Las fichas no pueden conectarse.");
        }

    }
}
