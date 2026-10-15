package clases.media;

import java.util.ArrayList;

public class Estudiante {
    private String nombreAlumno;
    private ArrayList<Modulo> modulos;

    public Estudiante(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
        this.modulos = new ArrayList<>();
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public ArrayList<Modulo> getModulos() {
        return modulos;
    }
    public void agregarModulo(Modulo modulo){
        modulos.add(modulo);
    }
    public void mostrarModulos(){
        for(Modulo m : modulos){
            System.out.println(m.getNombre());
        }
    }

}
