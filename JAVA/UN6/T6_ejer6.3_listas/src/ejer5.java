import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        List<Integer> lista = new ArrayList<>();
        do {
            x = sc.nextInt();
            String numero = Integer.toString(x);
            //LEER DIGITOS DE UNA LISTA UNO A UNO
            for (int i = 0; i < numero.length(); i++) {
                lista.add(Character.getNumericValue(numero.charAt(i)));
            }

            //COMPARAR LISTAS INVERTIDAS
            List<Integer> invertida = new ArrayList<>(lista);
            java.util.Collections.reverse(invertida);

            if (lista.equals(invertida)) {
                System.out.println("si");
            } else {
                System.out.println("no");
            }
    } while(x !=0);
    }
}