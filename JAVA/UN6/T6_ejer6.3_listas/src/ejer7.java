import java.util.*;

public class ejer7 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for(int i = 1; i < 50;i++){
            lista.add(i);
        }

        Collections.shuffle(lista);
        System.out.println(lista);

        List<Integer> resultadoSorteo = new ArrayList<>();
        for(int j = 0; j < 6;j++){
            resultadoSorteo.add(lista.get(j));
        }
        System.out.println(resultadoSorteo);
    }

}
