package videojuegos;

import java.util.Objects;

public class Videojuegos implements Comparable<Videojuegos> {
    private final String titulo;
    private final int lanzamiento;
    private double puntuacion;

    public Videojuegos(String titulo, int lanzamiento, double puntuacion) {
        this.titulo = titulo;
        this.lanzamiento = lanzamiento;
        this.puntuacion = puntuacion;
    }
    public String getTitulo() {
        return titulo;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Videojuegos that = (Videojuegos) o;
        return Objects.equals(titulo, that.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(titulo);
    }


    @Override
    public String toString() {
        return "Videojuegos{" +
                "titulo='" + titulo + '\'' +
                ", lanzamiento=" + lanzamiento +
                ", puntuacion=" + puntuacion +
                '}';
    }

    //EJERCICIO 6
    @Override
    public int compareTo(Videojuegos o) {
        return this.titulo.compareTo(o.titulo);
    }
}
