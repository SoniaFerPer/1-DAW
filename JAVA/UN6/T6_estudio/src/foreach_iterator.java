import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class foreach_iterator {
    public static void main(String[] args) {
        List<String> prueba1 = new LinkedList<>(List.of("platano","manzana","fresa","uva"));
        //ITERADOR PARA MODIFICAR Y CONTROLAR
        //FOREACH SOLO PARA RECORRER

        //recorrer con iterator
        Iterator<String> it = prueba1.iterator();
        while(it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }

        //ITERATOR PARA CONDICIONES
        while(it.hasNext()){
            String e = it.next();
            if(e.equals("uva")){
                it.remove();
            }else{
                System.out.println(e);
            }

         //FOREACH CON LAMBDA SI PUEDE MODIFICARSE
            prueba1.forEach(i -> {
                if(e.equals("uva")){
                    prueba1.remove(i);
                }
            });
        }
    }
}