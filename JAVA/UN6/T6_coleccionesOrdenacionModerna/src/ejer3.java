import java.util.ArrayList;
import java.util.List;

public class ejer3 {
    public static void main(String[] args) {
        List<String> parole = new ArrayList<>(List.of("teclado","ratón","monitor"));
        parole.replaceAll(palabra->palabra.toUpperCase());
        parole.forEach(System.out::println);
    }
}