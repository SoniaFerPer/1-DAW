import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogServidor {
    public static void main(String[] args) {
        String[] logs = {
                "[2024-03-15 10:15:30] ERROR: Database connection falle",
                "[2024-03-15 10:15:32] WARNING: Ignoring request wi",
                "[2024-03-15 10:15:33] INFO: Service shutdown",
                "[2024-03-15 10:15:35] INFO: Service started",
                "[2024-03-15 10:15:37] DEBUG: Command run more than"
        };
        /*  \\[(?<fecha>[^]]+)\] esto significa que capture todo lo que este entre llaves:
            \\[ → encuentra un [ literal
            (?<fecha> ... ) → captura como grupo llamado fecha
            [^]]+ → uno o más caracteres, siempre que NO sean ]
            \\] → encuentra un ] literal que cierra

            .+ cualquier caracter menos un salto de linea 1 o mas veces
         */

        Pattern patron = Pattern.compile("\\[(?<fecha>[^]]+)\\]\\s(?<codigo>\\w+[A-Z]):\\s(?<mensaje>.+)");
        for(String linea : logs){
            Matcher m = patron.matcher(linea);
            if(m.find()){
                String fecha = m.group("fecha");
                String codigo = m.group("codigo");
                String mensaje = m.group("mensaje");
                System.out.println(fecha);
                System.out.println(codigo);
                System.out.println(mensaje);
            }
        }

    }
}
