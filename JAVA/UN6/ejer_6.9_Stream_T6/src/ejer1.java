import java.util.Arrays;
import java.util.List;

public class ejer1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5,12,8,15,20,3,18);
        long count = numeros.stream().filter(n -> n > 10).filter(n -> n % 2 == 0).count();
        System.out.println(count);

    }
}