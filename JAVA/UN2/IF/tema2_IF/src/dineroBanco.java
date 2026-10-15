import java.util.Scanner;

public class dineroBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo=500,sacarDinero;



        System.out.printf("Tu saldo disponible es de %.2f €.\n",saldo);
        System.out.print("Dime la cantidad de dinero que deseas retirar: ");
        sacarDinero=sc.nextDouble();

        double saldoRestante  = saldo - sacarDinero;

        if(saldo<sacarDinero){
            System.out.printf("Cantidad no válidad. Tu saldo es de %.2f €.",saldo);
        }else
            System.out.printf("Tu saldo restante es de %.2f €",saldoRestante);

    }
}
