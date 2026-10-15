package Act11;

public class Cancion {
    private final String titulo;
    private final String artista;
    private final int duracion;
    private boolean reproduciendo;
    private int posicion;

    public Cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.reproduciendo = false;
        this.posicion = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public boolean isReproduciendo() {
        return reproduciendo;
    }

    public void setReproduciendo(boolean reproduciendo) {
        this.reproduciendo = reproduciendo;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void estado(){
        System.out.println(reproduciendo == true ? "Reproduciendo" : "En pausa");
    }
    public void pausar(){
        this.reproduciendo = false;
    }
    public void reproducir(){
        this.reproduciendo = true;
    }

    public String duracionTotal(){
        int minutos = this.duracion / 60;
        int segundos = this.duracion % 60;
        return String.format("%02d:%02d",minutos,segundos);
    }
    public String posicionActual(){
        int minutos = this.posicion / 60;
        int segundos = this.posicion % 60;
        return String.format("%02d:%02d",minutos,segundos);
    }
    /*
    Constructores y Métodos void: Los métodos que realizan una acción (como pausar o rebobinar) deben ser void,
    ya que su función es cambiar el estado interno del objeto, no devolver un valor.
     */
    public void tic(){
       if(reproduciendo && posicion < duracion){
           posicion++;
       }
    }

    public void rebobinar(){
        this.posicion = 0;
    }

    @Override
    public String toString() {
        String textoEstado = reproduciendo ? "Reproduciendo" : "En pausa";
        return String.format("%s - %s/%s", textoEstado, posicionActual(), duracionTotal());
    }
}
