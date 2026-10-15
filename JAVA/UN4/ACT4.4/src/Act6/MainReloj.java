package Act6;


public class MainReloj {
    public static void main(String[] args) {

        Reloj n1 = new Reloj(23,59,59);
        n1.tic();
        System.out.println(n1.toString());
    }
}