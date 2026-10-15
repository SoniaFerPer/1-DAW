import java.util.ArrayList;
import java.util.List;

public class ejer2 {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>(List.of(4.5,7.0,3.2,8.9,9.5,2.1));
        notas.removeIf(nota-> nota < 5.0);
        notas.forEach(System.out::println);

    }
}