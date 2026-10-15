import java.util.ArrayList;
import java.util.List;

public class ejer1 {
    public static void main(String[] args) {
        List<Integer> enteros = new ArrayList<>();
        for(Integer i = 10; i <= 100; i+= 10){
            enteros.add(i);
        }
        System.out.println(enteros);
        enteros.forEach(System.out::println);
        enteros.reversed().forEach(System.out::println);

    }
}