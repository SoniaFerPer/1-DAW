import java.util.Scanner;
import java.util.regex.Pattern;

public class treintayUnDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine().trim();
        /*
        0[1-9]  si empieza por 0 que vaya seguido del 1 al 9
        [12]\d  si empieza por 1 o 2 puede ir seguido por cualquier numero
        3[01]   si empieza por 3 solo puede ir seguido de un 1
        va todo entre parentesis para buscarlo dentro de una cadena
         */
        Pattern patron = Pattern.compile("(0[1-9]|[12]\\d|3[01])");
        if(patron.matcher(entrada).matches()){
            System.out.print("Es un dia valido");
        }else{
            System.out.print("Es un dia invalido");
        }
    }
}
