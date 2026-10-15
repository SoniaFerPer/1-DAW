import java.util.Scanner;

public class mesesConLetra {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Di el mes del año: ");
        String mes = sc.nextLine().toUpperCase();
        int numMes;

        switch (mes){
            case "ENERO":
                numMes = 1;
                break;
            case "FEBRERO":
                numMes = 2;
                break;
            case "MARZO":
                numMes = 3;
                break;
            case "ABRIL":
                numMes = 4;
                break;
            case "MAYO":
                numMes = 5;
                break;
            case "JUNIO":
                numMes = 6;
                break;
            case "JULIO":
                numMes = 7;
                break;
            case "AGOSTO":
                numMes = 8;
                break;
            case "SEPTIEMBRE":
                numMes = 9;
                break;
            case "OCTUBRE":
                numMes = 10;
                break;
            case "NOVIEMBRE":
                numMes = 11;
                break;
            case "DICIEMBRE":
                numMes = 12;
                break;
            default:
                numMes = 0;
                System.out.println("No es un mes válido");

        }

        System.out.println(numMes);


    }
}

