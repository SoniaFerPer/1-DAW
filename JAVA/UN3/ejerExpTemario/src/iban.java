import java.util.Scanner;
import java.util.regex.Pattern;

public class iban{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String entrada=sc.nextLine();
    Pattern patron=Pattern.compile("[A-Z]{2}[A-Z0-9]{14,32}");
    Pattern patronIberico= Pattern.compile("[ES|PT]{2}\\d{14,32}");
    if(patron.matcher(entrada).matches() && !patronIberico.matcher(entrada).matches()){
        System.out.print("Es un Iban, pero no iberico");
    }else {
        System.out.print("Es un Iban Iberico");
    }

    }
}
