import java.time.LocalDate;
import java.util.*;

public class ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<LocalDate, Set<Integer>> sorteo = new HashMap<>();

        while (true){
            String linea = sc.nextLine().trim();
            if(linea.isBlank()) break;
            String[] partes = linea.split(" ");

            LocalDate fecha = LocalDate.parse(partes[0]);

            Set<Integer> numeros = new HashSet<>();

            for (int i = 1; i < partes.length; i++) {
                numeros.add(Integer.parseInt(partes[i]));
            }

            // b) comprobar que hay 6 números distintos
            if (numeros.size() == 6) {
                sorteo.put(fecha, numeros);
            }
        }

        while (true) {

            // c) mostrar fechas válidas
            System.out.println("Fechas de sorteos válidos: " + sorteo.keySet());

            // d) leer fecha
            String entrada = sc.nextLine();

            LocalDate fecha = LocalDate.parse(entrada);

            if (!sorteo.containsKey(fecha)) {
                break;
            }

            // leer 6 números
            Set<Integer> apuesta = new HashSet<>();

            String[] nums = sc.nextLine().split(" ");

            for (String n : nums) {
                apuesta.add(Integer.parseInt(n));
            }

            // calcular aciertos
            Set<Integer> resultado = new HashSet<>(sorteo.get(fecha));
            resultado.retainAll(apuesta);

            System.out.println("Aciertos: " + resultado.size());
        }


    }
}
