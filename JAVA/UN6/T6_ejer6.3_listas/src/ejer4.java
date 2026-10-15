import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ejer4 {
    static Random rand = new Random();
    public static void main(String[] args) {
        List<Integer> entero = new ArrayList<>();
        for(Integer i = 0 ;i <= 20 ; i++){
            entero.add(rand.nextInt(10,99));
        }

        System.out.println(entero);

        //METODO BURBUJA EN ARRAYLIST
        for (int i = 0; i < entero.size() / 2; i++) {
            int j = entero.size() - 1 - i;
            int temp = entero.get(i);
            entero.set(i, entero.get(j));
            entero.set(j, temp);
        }

        System.out.println(entero);

    }
}