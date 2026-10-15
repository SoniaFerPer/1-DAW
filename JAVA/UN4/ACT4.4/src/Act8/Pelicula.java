package Act8;

public class Pelicula {
    private final String titulo;
    private final String director;
    private final int anioLanzamiento;
    private int valoracion;

    public Pelicula(String titulo, String director, int anioLanzamiento, int valoracion) {
        this.titulo = titulo;
        this.director = director;
        this.anioLanzamiento = anioLanzamiento;
        setValoracion(valoracion);
    }

    public void setValoracion(int valoracion) {
        if (valoracion < 0 || valoracion > 5) {
            throw new IllegalArgumentException("La valoración debe estar entre 0 y 5");
        }
        this.valoracion = valoracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public int getValoracion() {
        return valoracion;
    }

    public int sumarEstrella(){
        if(this.valoracion < 5) return ++this.valoracion;
        else return this.valoracion;

    }
    public int quitarEstrella() {
        if (this.valoracion > 0) return --this.valoracion;
        else return this.valoracion;
    }

    public void repeat(int veces){
        for(int i = 0; i < veces; i++){
            System.out.println(mostrarInformacion());
        }
    }
    public String mostrarInformacion() {
        return "Titulo: " + titulo + "\n" +
                "Año: " + anioLanzamiento + "\n" +
                "Director: " + director + "\n"  +
                "Valoracion: " + "*" .repeat(valoracion);
    }

}
