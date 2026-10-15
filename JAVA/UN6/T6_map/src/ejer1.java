import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> repeticion = new TreeMap<>();

        while(true){
            String palabra = sc.nextLine().trim().toUpperCase();
            if(palabra.trim().equals(".")) break;

            //COMPROBACION DE CLAVE Y VALOR si ESTA, SUMAMOS UNO
            if(repeticion.containsKey(palabra)){
                repeticion.put(palabra,repeticion.get(palabra) + 1);
            }else{
                repeticion.put(palabra,1);
            }
        }
        System.out.println(repeticion);


    }
}