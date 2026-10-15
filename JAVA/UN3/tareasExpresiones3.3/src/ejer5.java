import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejer5 {
    public static void main(String[] args) {
    String cadena = "border-color: #ff0910; background-color: #A0A0a0;";
        Pattern patron = Pattern.compile("#\\w+");
        Matcher mat = patron.matcher(cadena);
        while(mat.find()){
            //System.out.println(mat.group());
            Pattern patron2 = Pattern.compile("[0-9a-fA-F]{2}");
            Matcher mat2 = patron2.matcher(mat.group());

            while(mat2.find()){
                //System.out.println(mat2.group());
                String trozo = mat2.group();
                String palabra = String.valueOf(Integer.parseInt(trozo,16));
                System.out.println(mat.group() + ": " + palabra);

                //seguramente para que me imprima todo seguido deba crear dos grupos de mat y luego 3 grupos para cada parte
            }

        }
    }
}
