import java.util.Arrays;

public class REPASOFINALburbujadicotomica {
    public static void main (String[] args){
        int [][] matriz = {
                {4,6,3},
                {9,7,2},
                {5,1,8}
        };
        //aplanar matriz
        int filas =matriz.length;
        int columnas = matriz[0].length;
        int [] arr = new int[filas*columnas];

        int index = 0;
        for(int [] fila : matriz){
            for(int num : fila){
                arr[index++] = num;
                System.out.print(num + " ");
            }
        }
        System.out.println();
        //metodo burbuja
        for(int i = 0;i<arr.length -1;i++){
            for(int j =0; j< arr.length -1 -i ; j++){
               if(arr[j] > arr[j+1]){
                   int aux = arr[j];
                   arr[j]= arr [j+1];
                   arr[j+1] = aux;
               }
            }
        }
        System.out.println(Arrays.toString(arr));
        //busqueda dicotomica
        final int N = 10; //longitud del array
        int num = 5;
        int izq = 0;
        int der = N;
        int centro;
        int intentos = 0;
        do{
            intentos++;
            centro = (der+izq) / 2;
            if(arr[centro]> num){
                der = centro - 1;
            }
            if(arr[centro] < num){
                izq = centro +1;
            }

        }while(izq <=der && arr[centro] != num);

        System.out.printf("He necesitado %d intentos\n",intentos);
        if(der<izq){
            System.out.printf("el numero no se ha encontrado, pero estaria por el indice %d\n",izq);
        }else{
            System.out.printf("el numero esta en el indice %d\n",centro);
        }
    }
}
