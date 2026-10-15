import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class ejer3 {
    public static void main(String[] args) {
        List<Integer> conDuplicados = new ArrayList<>();
        for(int i = 0 ; i <= 20 ; i++){
            conDuplicados.add(ejer2.rand.nextInt(1,10));
        }
        System.out.println(conDuplicados);

        //CREAR UNA LISTA DE OTRA SIN DUPLICADOS
        //se crea una segunda lista, se le añade la primera y se transforma a linkedlist
        List<Integer> sinDuplicados = new ArrayList<>();
        sinDuplicados.addAll(conDuplicados);
        sinDuplicados = new LinkedList<>(new LinkedHashSet<>(sinDuplicados));
        System.out.println(sinDuplicados);

    }
}