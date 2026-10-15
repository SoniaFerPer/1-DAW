import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejer2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //HASHMAP PORQUE NO HACE FALTA QUE ESTE EN ORDEN SINO ACCEDER RAPIDO
        Map<Character, String> morse = new HashMap<>();

        morse.put('A', ".-");
        morse.put('B', "-...");
        morse.put('C', "-.-.");
        morse.put('D', "-..");
        morse.put('E', ".");
        morse.put('F', "..-.");
        morse.put('G', "--.");
        morse.put('H', "....");
        morse.put('I', "..");
        morse.put('J', ".---");
        morse.put('K', "-.-");
        morse.put('L', ".-..");
        morse.put('M', "--");
        morse.put('N', "-.");
        morse.put('O', "---");
        morse.put('P', ".--.");
        morse.put('Q', "--.-");
        morse.put('R', ".-.");
        morse.put('S', "...");
        morse.put('T', "-");
        morse.put('U', "..-");
        morse.put('V', "...-");
        morse.put('W', ".--");
        morse.put('X', "-..-");
        morse.put('Y', "-.--");
        morse.put('Z', "--..");
        morse.put('0',"----");
        morse.put('1',".----");
        morse.put('2',"..---");
        morse.put('3',"...--");
        morse.put('4',"....-");
        morse.put('5',".....");
        morse.put('6',"-....");
        morse.put('7',"--...");
        morse.put('8',"---..");
        morse.put('9',"----.");

        //INTRODUZCO EL TEXTO
        String texto = sc.nextLine().toUpperCase();
        //LLAMO AL METODO Y LO IMPRIMO
        System.out.println(textoAMorse(texto,morse));

    }
        //METODO PARA INTRODUCIR TEXTO Y TRANSFORMARLO A MORSE
    public static String textoAMorse(String texto, Map<Character,String> morseMap){
        //LO METO EN UN STRING BUILDER, Y VOY RECORRIENDO CARACTER A CARACTER Y AÑADIENDOLO AL STRINGBUILDER
        StringBuilder resultado = new StringBuilder();

        //lee caracter a caracter y el texto lo transforma en un array de char
        for (char c : texto.toUpperCase().toCharArray()) {
            //si hay espacio, ponemos dos
            if (c == ' ') {
                resultado.append("  ");
                //si esta el caracter en el map lo añadimos al stringbuilder y ponemos entre cada letra un espacio
            } else if (morseMap.containsKey(c)) {
                resultado.append(morseMap.get(c)).append(" ");
            }
            // si no está en el mapa, se ignora
        }
        //volvemos a convertir el resultado en un String para poder imprimirlo
        return resultado.toString().trim();
    }

}
