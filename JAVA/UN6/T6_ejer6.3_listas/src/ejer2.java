import java.util.*;

public class ejer2 {
    static Random rand = new Random();
    public static void main(String[] args) {
        List<Integer> enteros = new ArrayList<>();
        for(Integer i = 0 ;i <= 20 ; i++){
            enteros.add(rand.nextInt(1,20));
        }

        System.out.println(enteros);

        int suma = 0;
        for( Integer i : enteros){
            suma += i;
        }
        System.out.println(suma);

        Optional<Integer> buscarMin = enteros.stream().min(Integer::compareTo);
        System.out.println(buscarMin);
        Optional<Integer> buscarMax = enteros.stream().max(Integer::compareTo);
        System.out.println(buscarMax);
        OptionalDouble buscarAVG = enteros.stream().mapToInt(Integer::intValue).average();
        if (buscarAVG.isPresent()) {
            System.out.println("El promedio es: " + buscarAVG.getAsDouble());
        } else {
            System.out.println("La lista está vacía");
        }
        //o imprimir directamente
        System.out.println(buscarAVG);

    }
}