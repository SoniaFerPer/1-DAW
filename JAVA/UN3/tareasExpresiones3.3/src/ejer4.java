import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        int contador = 1;
        while(contador <= num){
            String entrada = sc.nextLine().trim();
            Pattern patron = Pattern.compile("(<hora>\\d{2}):(<minuto>\\d{2})\\s(\\w[AP])");
            Matcher m = patron.matcher(entrada);
            while(m.find()){
                if(m.group(1).equals("<hora>") && m.group(3).equals("P")){

                }
                System.out.println();
                }
            contador++;
        }


    }
}
