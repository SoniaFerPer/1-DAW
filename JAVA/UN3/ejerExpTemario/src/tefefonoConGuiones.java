import java.util.Scanner;
import java.util.regex.Pattern;

public class tefefonoConGuiones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine().trim();
        //-? indica que los guiones son opcionales
        Pattern patron = Pattern.compile("\\d{3}-?\\d{3}-?\\d{3}");
        if(patron.matcher(entrada).matches()){
            System.out.println("Es un numero valido");
        }else{
            System.out.print("Es un numero invalido");
        }
    }
}
