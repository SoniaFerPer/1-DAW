import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ejer4 {
    public static void main(String[] args) {
        Random rand = new Random();
        Set<Integer> set1 = new TreeSet<>();
        for(int i = 6; i > 1; i--){
            int x = rand.nextInt(1,49);
            set1.add(x);
        }
        System.out.println(set1);
    }
}