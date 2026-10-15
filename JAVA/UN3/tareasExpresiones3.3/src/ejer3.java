import java.util.Scanner;
import java.util.regex.Pattern;

public class ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        int contador = 1;
        while(contador <= num){
            String entrada = sc.nextLine().trim();
            Pattern patron1 = Pattern.compile("\\d{4}[BCDFGHJKLMNPRSTVWXYZ]{3}");
            // Pattern patron1 = Pattern.compile("\\d{4}[A-Z&&[^AEIOUQ]]{3}"); //ESTO ES UNA INTERSECCION QUE ES DENTRO DE LA A A LA Z OMITIR ESTO
            Pattern patron2 = Pattern.compile("[A-Z]{1,2}\\d{4}[A-Z]{1,2}");
            if(patron2.matcher(entrada).matches() || patron1.matcher(entrada).matches()){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
            contador++;
        }

    }
}
