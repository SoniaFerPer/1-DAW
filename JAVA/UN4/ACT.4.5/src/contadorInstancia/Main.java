package contadorInstancia;

public class Main {
    public static void main(String[] args) {
        Contador p1 = new Contador();
        Contador p2 = new Contador();
        Contador p3 = new Contador();
        Contador p4 = new Contador();


        System.out.println(Contador.getTotalInstancias());
    }
}