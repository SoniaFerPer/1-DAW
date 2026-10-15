import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtraerFecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine().trim();
        //dia-fecha y año separados por parentesis para poder luego poder agruparlos
        //^ esto obliga a que empiece a buscar desde el año y no con espacios o otros caracteres
        //& y esto que no haya nada detras de la cadena
        Pattern patronFecha = Pattern.compile("^(\\d{4})-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$");
        Matcher m = patronFecha.matcher(entrada);
        if(m.matches()){
            int anio = Integer.parseInt(m.group(1));
            int mes = Integer.parseInt(m.group(2));
            int dia = Integer.parseInt(m.group(3));
            System.out.println("fecha valida");
            System.out.println("Día: " + dia);
            System.out.println("Mes: " + mes);
            System.out.println("Año: " + anio);
        }else {
            System.out.print("fecha invalida");
        }
    }
}
