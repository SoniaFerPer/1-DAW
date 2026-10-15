import java.util.Scanner;

public class ejerSoloPares {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int suma=0;
        char eleccion;

        int [] listado = new int[10];

        for(int i = 0;i > 10;i++){
            listado[i]=sc.nextInt();
        }

        do{
            System.out.println("Quieres ver pares(P) o impares(I): ");
            eleccion = sc.nextLine().toUpperCase().charAt(0);
            for(int j : listado){
                if(eleccion == 'P'){
                    if(j % 2 == 0){
                        System.out.println(j);
                        System.out.println("Son " + j + " números.");
                        suma += j;
                        System.out.println(suma);
                    }else{
                        System.out.println(j);
                        System.out.println("Son " + j + " números.");
                        suma += j;
                        System.out.println(suma);
                    }
                }
            }

        }while(eleccion=='P' || eleccion=='I');
    }
}
