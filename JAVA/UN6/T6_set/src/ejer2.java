import java.util.*;

public class ejer2 {
    static Random rand = new Random();
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new TreeSet<>();
        Set<Integer> set3 = new LinkedHashSet<>();

        //hashset no orden
        for(int i = 0; i < 20 ; i++){
            int x = rand.nextInt(10,99);
            set1.add(x);
        }
        //treeset orden alfabetico
        for(int j = 0; j < 20 ; j++){
            int n = rand.nextInt(10,99);
            set2.add(n);
        }
        //linkedhashset orden por insercion
        for(int d = 0; d < 20 ; d++){
            int m = rand.nextInt(10,99);
            set3.add(m);
        }
        //TAMAÑO DE 20, PERO COMO NO ADMITE DUPLICADOS SE QUITAN LOS DUPKLICADOS Y POR ESO A VECES NO SALE 20
        System.out.println(set1.size());
        System.out.println(set2.size());
        System.out.println(set3.size());

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

    }
}