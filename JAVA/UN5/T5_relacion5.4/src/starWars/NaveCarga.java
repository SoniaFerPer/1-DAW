package starWars;
public class NaveCarga extends NaveEspacial {

    private double cargaMaxima;
    private double cargaActual = 0;

    public NaveCarga(String nombre, int tripulacion, double cargaMaxima) {
        super(nombre, tripulacion);
        this.cargaMaxima = cargaMaxima;
    }

    public void cargar(double peso) {
        if (cargaActual + peso <= cargaMaxima) {
            cargaActual += peso;
            System.out.println("¡Carga realizada con éxito!");
        } else {
            throw new IllegalArgumentException("No es posible cargar la nave.");
        }
    }

    @Override
    public void activarSistemaDefensa() {
        System.out.println(nombre + ": Escudos reforzados para protección de la carga activados");
    }
}