package excepciones;

public class Main {
    public static void main(String[] args){
        CuentaBancaria c1 = new CuentaBancaria(3000);

        try{
            c1.retirar(2000);
        }catch (IllegalArgumentException e){
            System.out.println("error: " + e.getMessage());
        }
    }
}
