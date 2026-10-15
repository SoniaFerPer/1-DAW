package Act7;

public class MainCalculadora {
    public static void main(String[] args) {
        Calculadora n1=new Calculadora(7,2);
        System.out.println(n1.suma());
        System.out.println(n1.resta());
        System.out.println(n1.producto());
        System.out.println(n1.cocienteDivision());
        System.out.println(n1.restoDivision());

    }
}