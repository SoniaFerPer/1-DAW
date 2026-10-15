import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ejer9 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> lista1 = new ArrayList<>();
        for(int j = 20; j > 0; j--){
            int i = rand.nextInt(10,99);
            lista1.add(i);
        }
        List<Integer> lista2 = new ArrayList<>();
        for(int x = 20; x > 0; x--){
            int num1 = rand.nextInt(10,99);
            lista2.add(num1);
        }
        System.out.println(lista1);
        System.out.println(lista2);

        List<Integer> fusion = new ArrayList<>();


        //TAMBIEN SIRVE PERO NO ES LO QUE PIDE
        fusion.addAll(lista1);
        fusion.addAll(lista2);
        Collections.sort(fusion);
        System.out.println(fusion);

    }
}