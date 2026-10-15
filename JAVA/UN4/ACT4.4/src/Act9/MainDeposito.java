package Act9;


public class MainDeposito {
    public static void main(String[] args) {

        Deposito n1=new Deposito(50);
        Deposito n2=new Deposito(70,30);

        System.out.println(n2.repostar(35));
        System.out.println(n2.consumir(20));
        System.out.printf("%d%%",n2.porcentaje()); //para imrpirmir el % hay que ponerlo doble
    }
}