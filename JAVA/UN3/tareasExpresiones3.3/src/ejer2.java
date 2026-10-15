import java.util.Scanner;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
// no puedo poner ^ ni $ porque no me lee los demas hastag
        Pattern patron = Pattern.compile("#\\w+");  // Busca hashtags dentro del texto

        while (true) {
            entrada = sc.nextLine().trim();

            Matcher mat = patron.matcher(entrada);

            boolean encontrado = false;

            while (mat.find()) {
                System.out.println(mat.group());
                encontrado = true;
            }

            if (!encontrado) {
                break;
            }
        }
    }
}
