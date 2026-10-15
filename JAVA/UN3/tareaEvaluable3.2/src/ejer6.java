import java.util.Scanner;

public class ejer6 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //vector de 4 posiciones
        int[] vector = new int[4];
        //el ejercicio nos pide preguntar tres veces
        for (int k = 0; k < 3; k++) {
            //aqui relleno con valores por teclado, tb podia haber declarado cada vector
            for(int i=0; i<4; i++) {
                vector[i] = sc.nextInt();
            }
            //preguntamos si lo queremos ascendente o descendente
            System.out.println("Introduce 'A' para ascendente o 'D' para descendente:");
            //teclamos la opcion
            char opcion = sc.next().toUpperCase().charAt(0);
            sc.nextLine();
            //si es una u otra respuesta lo mentemos en un operador ternario
            char eleccion = (opcion == 'A') ? 'A' : 'D';

            //llamamos a la funcion
            boolean ordenado = AscOdes(vector,eleccion);
            System.out.println("¿El vector está ordenado? " + ordenado);
            sc.close();
        }
    }

    public static boolean AscOdes(int[] vector, char opcion) {
        //recorremos el vector pero le ponemos menos 1 para que llegue a la ultima posicion
        for (int i = 0; i < vector.length - 1; i++) {
            if (opcion == 'A') {
                //aqui si  la posicion i es mayor que la siguiente posicion i (i + 1), es decir ascendente
                if (vector[i] > vector[i + 1]) {
                    return false;
                }
            } else {
                //lo contrario para descendente, puesto que si la i es menor que la siguiente i(i + 1) es decendente
                if (vector[i] < vector[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
