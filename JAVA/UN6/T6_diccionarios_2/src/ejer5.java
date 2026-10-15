
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();

        Map<String, Integer> contador = new HashMap<>();
        //CONVERTIMOS CADA PALABRA A UN ARRAY DE STRING SEPARANDOLAS CON UN SPLIT DE UN ESPACIO
        String[] palabras = frase.toLowerCase().split(" ");

        //USAMOS UN FOR EACH PARA QUE CADA PALABRA SE AÑADA AL MAP, Y QUE SI SE REPITE, SE LE SUME UNO AL VALOR
        for (String palabra : palabras) {
            //FORMA MODERNA
            contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);

            //FORMA CLÁSICA
//            if(contador.containsKey(palabra)){
//                int valorActual = contador.get(palabra);
//                contador.put(palabra,valorActual + 1);
//            }else{
//                contador.put(palabra,1);
//            }
        }

        //IMPRIMIMOS LA KEY Y EL VALOR
        contador.forEach((palabra, veces) -> System.out.println(palabra + ": " + veces));



    }
}