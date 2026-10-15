import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ejer6 {
    static Random rand = new Random();
    public static void main(String[] args) {
    List<Integer> todos = new ArrayList<>();
    for(int j = 20; j > 0; j--){
        int i = rand.nextInt(10,99);
        todos.add(i);
    }

    List<Integer> pares = new ArrayList<>();
    List<Integer> impares = new ArrayList<>();

    for(Integer num: todos){
        if(num % 2 == 0){
            pares.add(num);
        }else{
            impares.add(num);
        }
    }
    System.out.println(pares);
    System.out.println(impares);
    }
}