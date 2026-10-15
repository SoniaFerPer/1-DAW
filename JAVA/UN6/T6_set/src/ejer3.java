import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> setn = new LinkedHashSet<>();
        int contador = 0;
        while(true){
            int i = sc.nextInt();
            if(i==0) break;
            setn.add(i);
            contador++;

        }
        System.out.println("distintos: " + setn.size());
        System.out.println("introducidos: " + contador);
    }
}