import java.util.Scanner;

public class FechaNoValida {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int diaFebrero, anio,dia,mes;
        boolean valida=true;

        System.out.print("Ingrese el dia: ");
        dia = sc.nextInt();

        System.out.print("Ingrese el mes (1- 12): ");
        mes = sc.nextInt();

        System.out.print("Ingrese el año: ");
        anio = sc.nextInt();

        if(anio % 400 == 0 || anio % 4 == 0 && anio % 100 != 0){
            diaFebrero = 29;
        }else {
            diaFebrero = 28;
        }

        //version añadiendolo el switch a un resultado
//        valida = switch (mes) {
//            case 1, 3, 5, 7, 8, 10, 12 -> dia >= 1 && dia <= 31;
//            case 2 -> dia >= 1 && dia <= diaFebrero;
//            case 4, 6, 9, 11 -> dia >= 1 && dia <= 30;
//            default -> valida;
//        };

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
               valida = dia >= 1 && dia <= 31;
                break;
            case 2:
                valida = dia >= 1 && dia <= diaFebrero;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                valida = dia >= 1 && dia <= 30;
                break;

        }

        if(valida){
            System.out.println("Fecha valida!");
        }else {
            System.out.println("Fecha invalida!");
        }
    }

}
