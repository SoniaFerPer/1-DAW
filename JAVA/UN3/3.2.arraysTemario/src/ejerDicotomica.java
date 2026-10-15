
import java.util.Scanner;

public class ejerDicotomica {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);


        /*este ejercicio consiste en ordenar los numeros e ir buscando el numero
         introducido para que te diga la posicion, y cuantos intentos le ha costado.
         Para buscarlo lo que hace es dividir el array por la mitad, busca en los dos lados
         y se queda con el que lo ha encontrado y asi repetidamente hasta que lo encuentre

         */

        //si el array no esta ordenado, hay que hacerlo con el metodo de la burbuja
        int [] lista = {4, 6, 11, 12, 12, 12, 17, 18, 18, 30};

        System.out.println("Introduce un numero para buscar: ");
        int n=sc.nextInt();

        int izq = 0;
        int der = lista.length;
        int centro = 0;
        int intentos = 0;

        do{




        }while (izq <= der && lista[centro] !=n);
    }
}
