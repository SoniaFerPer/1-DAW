import java.util.Scanner;

public class contarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        INTENTAR AHORRAR LINEAS
        int contador0=0, contadorPos=0, contadorNeg=0;
         */

        int contador0=0;
        int contadorPos=0;
        int contadorNeg=0;
        for(int i=0;i<10;i++){
            System.out.print("Diga un numero: ");
            int num = sc.nextInt();
            if(num > 0){
                contadorPos++;
            }else if(num < 0){
                contadorNeg++;
            }else {
               contador0++;
            }

        }
        System.out.println("numeros positivos: " +  contadorPos + "\nnumeros negativos: " +  contadorNeg + "\ncero: " + contador0);


    }
}