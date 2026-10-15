import java.util.Scanner;

public class vigilaConsumo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double potenciaMedia, potenciaTotal;

        System.out.print("Dime la potencia media en W: ");
        potenciaMedia = sc.nextDouble();
        potenciaTotal = potenciaTotal(potenciaMedia);

        System.out.printf("El consumo de su energia en 24 horas es de %.2f KWh" , potenciaTotal);

        if (potenciaTotal >= 72) {
            System.out.println("¡CUIDADO! Detectado un consumo elevado.");
        }

        //IF DOBLE
//        if (potenciaTotal >= 72) {
//            System.out.println("¡CUIDADO! Detectado un consumo elevado.");
//        }else {
//            System.out.println("Tu consumo no es elevado, sigue así.");
//        }

        sc.close();
    }

    public static double potenciaTotal(double potenciaMedia){

        return (potenciaMedia*24) / 1000;
    }
}
