import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ejer1 {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        for(int i = 10; i <= 100; i+=10){
            set.add(i);

        }

        System.out.println(set);
        //CON FOR EACH
        for(Integer x : set){
            System.out.println(x);
        }

        //CON ITERATOR
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            int iterando = it.next();
            System.out.println(iterando);
        }

    }
}