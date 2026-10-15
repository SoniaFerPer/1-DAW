import java.util.Scanner;

public class contandoPares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un numero ");
        int num = sc.nextInt();

        int contadorPar = 0;
        while (num >= 0) {

            if(num %2 == 0){
                contadorPar++;
            }
            System.out.println("Escriba un numero ");
            num = sc.nextInt();

        }
        System.out.println("Hay " + contadorPar + " numeros pares");
        sc.close();



//        //VERSION 2
//        Scanner sc = new Scanner(System.in);
//
//        boolean continuar = false;
//        int contadorPar = 0;
//        while (continuar == false) {
//            System.out.println("Escriba un numero ");
//            int num = sc.nextInt();
//            if (num < 0){
//                continuar = true;
//            }else if(num %2 == 0){
//                contadorPar++;
//            }
//
//        }
//        System.out.println("Hay " + contadorPar + " numeros pares");
//        sc.close();
//

    }
}
