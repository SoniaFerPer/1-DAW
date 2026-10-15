import java.util.Scanner;

public class mesesAnio {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Di el numero del mes: ");
        int num = sc.nextInt();

        switch (num){
            case 1:
                System.out.print("Enero.");
                break;
            case 2:
                System.out.print("Febrero");
                break;
            case 3:
                System.out.print("Marzo");
                break;
            case 4:
                System.out.print("Abril");
                break;
            case 5:
                System.out.print("Mayo");
                break;
            case 6:
                System.out.print("Junio");
                break;
            case 7:
                System.out.print("Julio");
                break;
            case 8:
                System.out.print("Agosto");
                break;
            case 9:
                System.out.print("Septiembre");
                break;
            case 10:
                System.out.print("Octubre");
                break;
            case 11:
                System.out.print("Noviembre");
                break;
            case 12:
                System.out.print("Diciembre");
                break;
            default:
                System.out.print("No es un número válido (1-12)");

        }



    }
}