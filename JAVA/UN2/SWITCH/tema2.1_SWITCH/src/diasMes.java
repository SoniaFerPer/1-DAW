
import java.util.Scanner;

public class diasMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Di el dia del mes: ");
        int numDia=sc.nextInt();
        String diaSemana ;

        switch (numDia) {
            case 1:
            case 8:
            case 15:
            case 22:
            case 29:
                diaSemana = "LUNES";
                break;
            case 2:
            case 9:
            case 16:
            case 23:
            case 30:
                diaSemana = "MARTES";
                break;
            case 3:
            case 10:
            case 17:
            case 24:
            case 31:
                diaSemana = "MIERCOLES";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                diaSemana = "JUEVES";
                break;
            case 5:
            case 12:
            case 19:
            case 26:
                diaSemana = "VIERNES";
                break;
            case 6:
            case 13:
            case 20:
            case 27:
                diaSemana = "SÁBADO";
                break;
            case 7:
            case 14:
            case 21:
            case 28:
                diaSemana = "DOMINGO";
                break;
            default:
                diaSemana = "... Ese día no existe ¬¬";


        }
        System.out.println("Ese día cae en " + diaSemana);
    }

}
