import java.util.Arrays;

public class BURBUJA {
    public static void main (String [] args){
        //DECLARAR ARRAY O MATRIZ
        int [][] matriz = {
                {9,2,5},
                {1,8,9},
                {7,6,4}
        };
        /*1º COMPROBAR SI VECTOR O MATRIZ
            1.1 SI MATRIZ, CONVERTIR A VECTOR O TB LLAMADO APLANAR MATRIZ
         */
        int filas = matriz.length; //devuelve cuántas filas tiene la matriz.
        int columnas = matriz[0].length; //accede a la primera fila Y obtiene cuántas columnas tiene esa fila.
        int [] arr = new int [filas*columnas]; //Se crea un vector de 9 posiciones.


        int index = 0; //lleva el control de en qué posición del vector se debe colocar el siguiente número.En 0 porque los arrays se inician en posicion 0.
        for (int [] fila : matriz) { // Este bucle recorre la matriz fila por fila.
            for (int num : fila) { //Segundo bucle: recorre cada número dentro de la fila actual.
                arr[index++] = num; //Guarda el número num dentro del array arr en la posición index.
                //OPCION UNO PARA IMPRIMIR ARRAY
                System.out.print(num + " ");
            }
        }
        System.out.println(); //no hacer caso, solo sirve para separar una impresion de otra
        //2ª OPCION PARA MOSTRAR NUEVO ARRAY CREADO A PARTIR DE MATRIZ
            //System.out.println(Arrays.toString(arr));

        //AHORA A ORDENAR EL ARRAY
        for (int i = 0; i < arr.length - 1; i++){ //siempre da uno mas por eso -1
            for (int j = 0; j < arr.length - 1 - i;j++){ // para que pase al siguiente -1 y -i
                if(arr[j] > arr[j+1]){ //si el numero j es mayor al siguiente (j+1) tenemos que hacer el cambio ej.j=7 j+1=5
                    int aux = arr[j]; //guardamos j en el aux ej. j=7
                    arr[j] = arr[j+1]; //metemos en j el j +1  ej.j pasa a ser 5
                    arr[j+1] = aux; //metemos el aux en j+1 ej.j+1 pasa a ser 7 asi queda en 5,7 al principio era 7,5
                }
            }
        }

    }
}
