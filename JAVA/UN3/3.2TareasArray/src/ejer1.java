import java.util.Scanner;

public class ejer1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] lista = new int[100];
        int contador = 0;

        // Lectura de números
        while (true) {
            int n = sc.nextInt();
            if (n < 0) break;

            lista[contador++] = n;
        }

        System.out.println("Cantidad de números introducidos: " + contador);

        // Mostrar sin ordenar
        for (int i = 0; i < contador; i++) {
            System.out.printf("%02d ", lista[i]);
        }
        System.out.println();

        // Ordenar
        ordenarArray(lista, contador);

        // Mostrar ordenado
        for (int i = 0; i < contador; i++) {
            System.out.printf("%02d ", lista[i]);
        }
        System.out.println();

        // Pedir min y max
        while (true) {
            int min = sc.nextInt();
            int max = sc.nextInt();

            if (min < 0 || max < 0) break;

            int idxMin = buscarIndice(lista, contador, min);
            int idxMax = buscarIndice(lista, contador, max);

            int cantidad = idxMax - idxMin;

            System.out.println(cantidad);
        }
    }

    public static int buscarIndice(int[] lista, int elementos, int valor) {
        int izda = 0, dcha = elementos - 1;

        while (izda <= dcha) {
            int centro = (izda + dcha) / 2;

            if (lista[centro] == valor) {
                return centro;
            }
            if (lista[centro] < valor) {
                izda = centro + 1;
            } else {
                dcha = centro - 1;
            }
        }
        return izda; // posición donde estaría
    }

    public static void ordenarArray(int[] lista, int elementos) {
        for (int i = 0; i < elementos - 1; i++) {
            for (int j = 0; j < elementos - i - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    int aux = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = aux;
                }
            }
        }
    }
}