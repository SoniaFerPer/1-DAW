public class ejer5 {
    public static void main(String[] args) {
        //es una matriz de numeros (una tabla) y tenemos que imprimir desde el numero que
        //pido, busco su indice y leo el resto de numeros siguientes de todos los indices

        int [][] lista = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int valor = 4; // Número desde el que queremos empezar
        boolean encontrado = false;

        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                if (lista[i][j] == valor) {
                    encontrado = true;
                }if (encontrado) {
                    System.out.print(lista[i][j] + " ");
                }
            }
        }
    }
}