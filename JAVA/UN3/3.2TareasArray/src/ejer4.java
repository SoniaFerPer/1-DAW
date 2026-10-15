import java.util.Random;

public class ejer4 {
    public static void main(String[] args) {

        int[] lista = {3, 5, 7, 2, 8, 1};
        int mayor, menor, aux;

        // guardamos el indice 0 en el aux y cuando valor sea mayor lo guardara en aux
        aux = lista[0];

        for (int i = 1; i < lista.length; i++) {

            if (aux > lista[i]) {
                mayor = aux;
                menor = lista[i];
            } else {
                mayor = lista[i];
                menor = aux;
            }

            System.out.println("Mayor: " + mayor + ", Menor: " + menor + "\n");

            // El auxiliar se convierte en el número actual
            aux = lista[i];
        }
    }
}