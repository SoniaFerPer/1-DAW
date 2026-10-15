package carteles;

public class Cartel {
    private String titulo;
    private int longitud;
    private Alineacion alineacion;

    public Cartel(String titulo) {
        this.longitud = titulo.length();
        this.alineacion = Alineacion.IZQUIERDA;
        setTitulo(titulo);
    }

    public Cartel(String titulo, int longitud) {
        this.longitud = longitud;
        this.alineacion = Alineacion.CENTRO;
        setTitulo(titulo);
    }

    public Cartel(String titulo, int longitud, Alineacion alineacion) {
        this.longitud = longitud;
        this.alineacion = alineacion;
        setTitulo(titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo.length() > longitud) {
            throw new IllegalArgumentException("La longitud no permite mostrar el título completo");
        }
        this.titulo = titulo;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        if (longitud < titulo.length()) {
            throw new IllegalArgumentException(
                    "La nueva longitud no permite mostrar el título"
            );
        }
        this.longitud = longitud;
    }

    public Alineacion getAlineacion() {
        return alineacion;
    }

    public void setAlineacion(Alineacion alineacion) {
        this.alineacion = alineacion;
    }

    public void dibujar() {

        String linea = "+" + "-".repeat(longitud) + "+";

        int izq = alineacion.espaciosIzquierda(longitud, titulo.length());
        int der = longitud - titulo.length() - izq;

        System.out.println(linea);
        System.out.println(
                "|" +
                        " ".repeat(izq) +
                        titulo +
                        " ".repeat(der) +
                        "|"
        );
        System.out.println(linea);
    }
}
