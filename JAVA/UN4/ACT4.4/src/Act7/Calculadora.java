package Act7;

public class Calculadora {
    private int operando1;
    private int operando2;

    public Calculadora(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public int getOperando1() {
        return operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

    public int suma(){
        return operando1 + operando2;
    }
    public int resta(){
        return operando1 - operando2; //no se si poner una condicion si el operando 2 es mayor al uno hacerlo al reves la resta
    }
    public int producto(){
        return operando1 * operando2;
    }
    public int cocienteDivision(){
        return operando1 / operando2; //no se si poner una condicion si el operando 2 es mayor al uno hacerlo al reves la resta
    }
    public int restoDivision(){
        return operando1 % operando2; //no se si poner una condicion si el operando 2 es mayor al uno hacerlo al reves la resta
    }


}
