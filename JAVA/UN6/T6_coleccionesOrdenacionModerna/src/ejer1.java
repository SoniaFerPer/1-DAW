import java.util.ArrayList;
import java.util.List;

public class ejer1 {
    public static void main(String[] args) {
        List<String> lenguajes = new ArrayList<>(List.of("Java","Python","JavaScript","C#"));

        //tradicional
        lenguajes.forEach(lenguaje -> System.out.println(lenguaje));

        System.out.println();
        //moderno
        lenguajes.forEach(System.out::println);

    }
}