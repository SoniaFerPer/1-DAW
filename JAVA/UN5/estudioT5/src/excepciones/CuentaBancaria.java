package excepciones;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    public void retirar(double cantidad){
        if(this.saldo< cantidad){
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo -= cantidad;
        System.out.println("Retiro realizado.Saldo restante: " + saldo);
    }


}
