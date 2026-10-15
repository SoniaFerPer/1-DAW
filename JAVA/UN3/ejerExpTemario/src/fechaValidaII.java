import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fechaValidaII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fecha = sc.nextLine().trim();
    Pattern patron = Pattern.compile("(\\d{4})[-/]" +        //año
            "(" + "(0[13578]|1[02])[/-](0[1-9]|[12]\\d|3[01])|" +    // Meses de 31 días
            "(0[469]|11)[/-](0[1-9]|[12]\\d|30])|" +            // Meses de 30 días
            "(02[/-](0[1-9]|1\\d|2[0-8]))" + ")"               // Febrero (no bisiestos)
    );
    Matcher m = patron.matcher(fecha);
    if(m.matches()){
        System.out.println("Fecha valida");
    }else {
        System.out.println("Fecha invalido");
    }

    }
}
