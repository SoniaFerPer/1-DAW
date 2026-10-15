package starWars;

public class CazaEstelar extends NaveCombate {
    double velocidadMaxima;

    public CazaEstelar(String nombre, int tripulacion, int potenciaArma, double velocidadMaxima) {
        super(nombre, tripulacion, potenciaArma);
        this.velocidadMaxima = velocidadMaxima;
    }

    public void activarHiperimpulso(){
        System.out.println(nombre + " activa el hiperimpulso a " + velocidadMaxima + "km/s");

    }
}
