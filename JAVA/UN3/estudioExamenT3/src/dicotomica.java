import java.util.Scanner;

public class dicotomica {
    public  static void main(String[] args) {
        final int N = 10; //el vector tiene 10 numeros
        //DEBE SER UN VECTOR
        int [] vector = {2,5,6,12,15,21,27,32,35,37};

        //NUMERO A BUSCAR
        int num = 7;

        //IMPLEMENTACION DE ERROR SI SE USA SCANNER
            //if(num == 0) break;

        //DECLARAMOS LOS CONTADORES
        int izq = 0;
        int der = N;
        int centro;
        int intentos = 0;

        //BUCLE DO PARA REPETIR HASTA ENCONTRAR POSICION
        do{
            intentos++;  // sumamos 1 al intento
            centro= (izq + der) / 2;  // el centro es la suma de la mitad + la mitad / 2
            if(vector[centro] > num){ //si en centro es mayor al numero
                der = centro - 1; //nos vamos a la parte de la izquierda, por eso es centro -1
            }
            if(vector[centro] < num){ //si el centro es menor al numero
                izq = centro + 1; // nos vamos a buscar a la derecha, por eso centro +1
            }
        }while (izq <= der && vector[centro] != num); //se repite mientras izquierda sea menor o igual a derecha Y centro no sea el num

        //IMPRIMIR RESULTADO
        System.out.printf("He necesitado %d intentos.\n",
                intentos);
        if (der < izq) {  // si la derecha es menor a la izquierda no se ha encontrado el numero en el array
            System.out.printf(
                    "No se ha encontrado, pero iría en el índice %d.\n",
                    izq);
        } else { //si la derecha es mayor a la izquierda si lo ha encontrado
            System.out.printf("Encontrado en el índice %d.\n",
                    centro);
        }
    }
}
