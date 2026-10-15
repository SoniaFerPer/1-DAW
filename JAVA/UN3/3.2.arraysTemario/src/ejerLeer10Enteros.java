import java.util.Random;
import java.util.Scanner;


public class ejerLeer10Enteros {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rand=new Random();

        int [] lista =new int[10];

        //introducir datos aleatorios
        for(int i =0; i<10;i++){

            System.out.println(lista[i]=rand.nextInt(0,100));
        }

        System.out.println("\n");

        //el mismo pero con for each
        for (int k : lista){
            System.out.println(k=rand.nextInt(0,100));
        }

        System.out.println("\n");

        //el mismo pero introducciendo datos por teclado
        for (int j : lista){
            System.out.println(j=sc.nextInt());
        }

    }
}
