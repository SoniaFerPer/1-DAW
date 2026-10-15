import java.util.Scanner;
import java.util.regex.Pattern;

public class fechaValida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine().trim();
        //Pattern patronEsp = Pattern.compile("(0[1-9]|[12]\\d|3[01])-(0[1-9]|1[0-2])-\\d{4}");
        Pattern patronFecha = Pattern.compile("\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])");
        if(patronFecha.matcher(entrada).matches()){
            System.out.print("fecha valida");
        }else {
            System.out.print("fecha invalida");
        }
    }
}
