package starWars;

public class NaveEspacial {
    String nombre;
    int tripulacion;

    public NaveEspacial(String nombre, int tripulacion) {
        this.nombre = nombre;
        this.tripulacion = tripulacion;
    }

    public String getNombre() { return nombre;}
    public int getTripulacion() { return tripulacion;}

    public void activarSistemaDefensa(){
        System.out.println(nombre + ": Escudos básicos activados.");
    }
}
