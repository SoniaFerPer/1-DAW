import java.util.Random;
import java.util.Scanner;

public class ejerSeRepite {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);

        int [] lista = new int[10];

            for (int i=0;i<10;i++) {
                lista[i] = rand.nextInt(10);
            }

            int numero,contador;
            do{
                numero=sc.nextInt();
                if(numero !=0){
                    contador = 0;
                    for(int i=0;i<10;i++){
                        if(numero == lista[i]){
                            contador++;
                        }
                    }
                    System.out.println(contador);
                }

            }while(numero !=0);

    }

}
