package asociacion;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> biblio;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.biblio = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarLibro(Libro libro){
        getBiblio().add(libro);
    }

    public ArrayList<Libro> getBiblio() {
        return biblio;
    }

    public void mostrarLibros(){
        for(Libro libro : biblio){ //recuerda es el tipo de elemento que lo contiene : lista que lo contiene
            System.out.println(libro.getTitulo());
        }
    }
}
