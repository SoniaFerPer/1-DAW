package starWars;

public class NaveCombate extends NaveEspacial {
    int potenciaArma;

    public NaveCombate(String nombre, int tripulacion, int potenciaArma) {
        super(nombre, tripulacion);
        this.potenciaArma = potenciaArma;
    }

    public void disparar(){
        System.out.println(nombre + " dispara con petencia " + potenciaArma + "GW.");
    }

    //se sobreescribe poniendo un nuevo system, no llamando al padre, porque salen dos mensajes, el del padre y el del hijo
    @Override
    public void activarSistemaDefensa() {
        System.out.println(nombre + ": Escudos deflectores activados.");
    }

}
