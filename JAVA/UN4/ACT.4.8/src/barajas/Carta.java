package barajas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Carta {
    private int numCartas;
    private Palo palo;
    private static final int[] NUMEROS_VALIDOS =
            {1,2,3,4,5,6,7,10,11,12};

    public Carta(int numero, Palo palo) {
        if (!esNumeroValido(numero)) {
            throw new IllegalArgumentException("Número inválido: " + numero);
        }else{
            this.setNumCartas(numero);
        }
        this.setPalo(palo);
    }

    public static int[] getNumerosValidos() {
        return NUMEROS_VALIDOS;
    }

    private boolean esNumeroValido(int n) {
        for (int i = 0; i < getNumerosValidos().length; i++) {
            if (getNumerosValidos()[i] == n) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return getNumCartas() + " de " + getPalo();
    }

    public void dibujarCarta(){
        System.out.println("+" + "-".repeat(9) + "+");
            if (numCartas < 10) {
                System.out.printf("| %d       |\n", numCartas);
            } else {
                System.out.printf("| %d      |\n", numCartas);
            }
        System.out.println("|         |");
        if(palo == Palo.COPAS){
            System.out.printf("|   %s |\n", getPalo());
        }if(palo == Palo.BASTOS){
            System.out.printf("|  %s |\n", getPalo());
        }if(palo == Palo.OROS){
            System.out.printf("|    %s |\n", getPalo());
        }if(palo == palo.ESPADAS){
            System.out.printf("| %s |\n", getPalo());
        }
        System.out.println("+" + "-".repeat(9) + "+");

    }

    public int getNumCartas() {
        return numCartas;
    }

    public void setNumCartas(int numCartas) {
        this.numCartas = numCartas;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }
}


