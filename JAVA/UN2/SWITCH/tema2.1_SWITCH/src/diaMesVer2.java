import java.util.Scanner;

public class diaMesVer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Di el dia del mes: ");
        int dia = sc.nextInt();

        switch (dia % 7) {
            case 1:
                System.out.println("Ese día cae en Lunes.");
                break;
            case 2:
                System.out.println("Ese día cae en Martes.");
                break;
            case 3:
                System.out.println("Ese día cae en Miércoles.");
                break;
            case 4:
                System.out.println("Ese día cae en Jueves.");
                break;
            case 5:
                System.out.println("Ese día cae en Viernes");
                break;
            case 6:
                System.out.println("Ese día cae en Sábado.");
                break;
            case 0:
                System.out.println("Ese día cae en Domingo.");
                break;

        }
    }

}
