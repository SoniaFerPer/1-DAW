package Act4;
//ponemos final cuando sepamos que los atributos de un objeto no va a cambiar, pero el IDE te sugiere que pongas final porque no hemos creado un setter,
//en planeta si son finales, pero el peso de una fruta si puede cambiar
public class Planeta {
    private final String nombre;
    private final double diametro;
    private long distancia;

    public Planeta(String nombre, double diametro, long distancia) {
        this.nombre = nombre;
        this.diametro = diametro;
        this.distancia = distancia;

    }

    public void setDistancia(long distancia) {
        this.distancia = distancia;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDiametro() {
        return diametro;
    }

    public long getDistancia() {
        return distancia;
    }


    @Override
    public String toString() {
        return "Planeta{" +
                "nombre='" + nombre + '\'' +
                ", diametro=" + diametro +
                ", distancia=" + distancia +
                '}';
    }
}
