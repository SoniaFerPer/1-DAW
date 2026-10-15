import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> listaPal = new LinkedHashSet<>();
        while(true){
            String palabra = sc.nextLine();
            //SI NO PONEMOS TRIM PARA QUITAR ESPACIOS PUEDE DAR ERROR
            // if(palabra.trim().equals(".")) break;
            //CON CONTAINS EN CUANTO APAREZCA . SE SALE
            if(palabra.contains(".")) break;
            listaPal.add(palabra);
        }

        System.out.println(listaPal.size());
        for(String pa : listaPal){
            System.out.println(pa);
        }
    }
}