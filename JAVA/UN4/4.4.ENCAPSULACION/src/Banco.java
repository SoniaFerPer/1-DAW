public class Banco {
    private String titular;
    private String cuentaBancaria;
    private double saldo;

    Banco(String titular, String cuentaBancaria, double saldo) {
        this.titular = titular;  //this.titular es la llamada al atributo y titular solo al parametro del constructor
        this.cuentaBancaria = cuentaBancaria;
        this.saldo = saldo;
    }

    public void retirarDinero(double cantidad){
        if(cantidad > saldo){
            throw new IllegalArgumentException("No tiene suficiente saldo.");
        }else{
            saldo -= cantidad;
        }
    }

    public void ingresarDinero(double cantidad){
        if(cantidad < 0){
                throw new ArithmeticException("Cantidad no válida.");
        }else {
            saldo += cantidad;
        }
    }

    public String getTitular() {  //GET SON PARA MOSTRAR PARA OBTENER el resultado
        return titular;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public double getSaldo() {
        return saldo;
    }

    //con los get si es booleano no se pone get se pone is

    //con los setters se tiene que poner siempre una excepcion porque si se modifica malo asique con cuidado



    @Override
    public String toString() {
        return "Banco{" +
                "titular='" + titular + '\'' +
                ", cuentaBancaria='" + cuentaBancaria + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
