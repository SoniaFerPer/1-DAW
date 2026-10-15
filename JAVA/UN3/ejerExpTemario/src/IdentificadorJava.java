import java.util.Scanner;
import java.util.regex.Pattern;

public class IdentificadorJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine().trim();
        //EL primer digito solo puede ser minuscula,mayuscula un dolar o una guion bajo,el resto puede ser lo mismo seguido de un digito y tiene que tener entre 4 y 15 caracteres
        Pattern patron =  Pattern.compile("[a-zA-Z$_][a-zA-Z$_\\d]{4,15}");
        if(patron.matcher(entrada).matches()){
            System.out.print("Puede ser usado como identificador.");
        }else{
            System.out.print("No puede ser usado como identificador.");
        }
    }
}
