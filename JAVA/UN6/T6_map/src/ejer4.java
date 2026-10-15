import java.util.*;

public class ejer4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, List<Integer>> terminaciones = new TreeMap<>();
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            if(num < 0) break;
            if(!terminaciones.containsKey(num % 10)){
                terminaciones.put(num %10, new ArrayList<>());
            }
            terminaciones.get(num % 10).add(num);

        }
        for(int i = 0; i < 10; i++){
            if(terminaciones.containsKey(i)){
                System.out.println("Terminados en " + i + ": " + terminaciones.get(i));
            }
        }
    }
}
