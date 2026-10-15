package comparable_comparator;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //DECLARAR DENTRO DE UNA LISTA OBJETOS
        List<Persona> prueba1 = Arrays.asList(new Persona("ana",34),new Persona("juan",25));
        //COMPARAR CON COMPARATOR
        prueba1.sort(Comparator.comparing(Persona::getEdad));
        //USANDO COMPARABLE
        Collections.sort(prueba1);
        prueba1.forEach(System.out::println);
    }
}