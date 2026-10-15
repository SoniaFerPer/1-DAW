package Act9;

public class Deposito {
    private final int capacidad;
    private int contenido;

    public Deposito(int capacidad) {
        this.capacidad = capacidad;
    }

    public Deposito(int capacidad, int contenido) {
        this.capacidad = capacidad;
        this.contenido = contenido;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public int repostar(int respostaje){
        if(contenido + respostaje > capacidad){
            throw new IllegalArgumentException("No se puede repostar mas de la capacidad del deposito.");
        }if(contenido + respostaje < 0){
            throw new IllegalArgumentException("El deposito no puede tener menos de 0 litros.");
        }
        this.contenido += respostaje;
        return this.contenido;
    }

    public int consumir(int repostaje){
        if(this.contenido - repostaje > capacidad){
            throw new IllegalArgumentException("No se puede consumir mas de la capacidad del deposito.");
        }if(this.contenido - repostaje < 0){
            throw new IllegalArgumentException("No se puede consumir menos de 0 litros.");
        }
        this.contenido -= repostaje;
        return this.contenido;
    }

    public boolean estaLleno(){
        if(contenido == capacidad){
            return true;
        }else return false;
    }
    public boolean estaVacio(){
        if(contenido == 0){
            return true;
        }else return false;
    }

    public int porcentaje(){
        return (this.contenido * 100) / this.capacidad;
    }

    @Override
    public String toString() {
        return contenido + "/" + capacidad + " litros" ;
    }

}
