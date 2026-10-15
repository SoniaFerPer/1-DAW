
import java.util.*;

public class ejer8 {
    static Random rand = new Random();
    public static void main(String[] args) {
        List<Integer> todos = new ArrayList<>();
        for(int j = 20; j > 0; j--){
            int i = rand.nextInt(10,99);
            todos.add(i);
        }

        //USANDO CLASE COLLECTIONS
        int min = Collections.min(todos);
        int max = Collections.max(todos);

        System.out.println("Mínimo: " + min + ", Máximo: " + max);


        //CON OPTIONAL Y STREAMS
        Optional<Integer> min2 = todos.stream().min(Integer::compareTo);
        Optional<Integer> max2 = todos.stream().max(Integer::compareTo);
        System.out.println(min2 + ", " + max2);
    }
}