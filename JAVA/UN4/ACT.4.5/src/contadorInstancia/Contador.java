package contadorInstancia;

public class Contador {
    private static int CONTADOR = 0;

    public Contador() {
        CONTADOR++;
    }

    public static void setCONTADOR(int CONTADOR) {
        Contador.CONTADOR = CONTADOR;
    }

    public static int getCONTADOR() {
        return CONTADOR;
    }

    public static int getTotalInstancias(){
        return getCONTADOR();  //PARA CONTAR INSTANCIAS DE OBJETOS DEBEMOS CREAR EL CONSTRUCTOR CON EL CONTADOR ++
    }


}
