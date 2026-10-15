import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ejer4 {
    public static void main(String[] args) {
        Map<String,Double> notasFinales = new HashMap<>();
        notasFinales.put("jose",5.60);
        notasFinales.put("Manuel",6.75);
        notasFinales.put("Dolores",5.60);
        notasFinales.put("julian",7.10);
        notasFinales.put("Julia",6.75);
        notasFinales.put("Maria",4.5);
        notasFinales.put("Emilia",8.43);

        //PARA NO MOSTRAR NOTAS REPETIDAS LO TRANSFORMAMOS A UN SET QUE NO PERMITE VALORES REPETIDOS
        Set<Double> notasUnicas = new HashSet<>(notasFinales.values());
        notasUnicas.forEach(System.out::println);

    }
}