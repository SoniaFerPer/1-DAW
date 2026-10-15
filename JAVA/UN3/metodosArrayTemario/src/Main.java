
public class Main {
    public static void main(String[] args) {
        int[] vector = {10, 20, 30, 40, 50, 60, 70, 80};
        int i;

        System.out.println("Antes:");
        for (i = 0;i<vector.length ; i++) {
            if (i > 0) System.out.print(", ");
            System.out.printf("vector[%d] = %d", i, vector.length);
        }
        System.out.println();
        invertir(vector);

        System.out.println("Después:");
        for (i = 0; i < 8; i++) {
            if (i > 0) System.out.print(", ");
            System.out.printf("vector[%d] = %d", i, vector.length);
        }
        System.out.println();
        invertir(vector);

    }

    public static void invertir(int [] m){
        int aux;
        int inv=m.length;

        for(int i = 0; i<inv / 2 ;i++){  //lo dividimos entre dos para que no vuelva a repetirse, cambiamos la mitad del array con la mitad de array
            aux=m[i]; //metemos el valor de cada i del array primero en un auxiliar
            m[i] = m[inv -1- i]; //con esto buscamos el ultimo indice del array (tamaño total) le quitamos 1 y para que vaya cambiando le quitamos tb el valor de i
            m[inv - 1 - i] = aux; // ahora le añadimos el numero guardado en el auxiliar para darselo a la ultima posicion
        }

    }
}