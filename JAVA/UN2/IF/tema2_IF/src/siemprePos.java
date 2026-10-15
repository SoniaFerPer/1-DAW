import java.util.Scanner;

public class siemprePos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        double num = sc.nextDouble();
        System.out.println(valorAbsoluto(num));

        sc.close();
    }
    //IF SIMPLE
    public static double valorAbsoluto (double num){
        if (num<0){
            num=-num;
        }
        return num;

    }


    //IF DOBLE
//    public static double valorAbsoluto2 (double num){
//        if (num<0){
//            num=Math.abs(num);
//        }else {
//            num=+num;
//        }
//        return num;
//
//    }

}
