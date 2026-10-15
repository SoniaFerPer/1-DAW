import java.util.Scanner;
import java.util.regex.Pattern;

public class horaValida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        /*
        ([01]\\d|2[0-3])
            Valida la hora entre 00 y 23    [01]\\d → 00–19
                                             |2[0-3] → 20–23
        Valida los minutos de 00 a 59   |    :[0-5]\\d
            El primer dígito puede ser 0, 1, 2, 3, 4 o 5 → 6 posibilidades
            El segundo dígito puede ser cualquier número del 0 al 9 → 10 posibilidades
        Valida los segundos de 00 a 59   |   :[0-5]\\d
         */
        Pattern patron = Pattern.compile("([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d");
        do{
            entrada =sc.nextLine().trim();
            System.out.println(patron.matcher(entrada).matches()?"SI":"NO");

        }while(!entrada.matches("[fF][iI][nN]"));

    }
}
