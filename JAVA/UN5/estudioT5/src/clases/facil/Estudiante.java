package clases.facil;

public class Estudiante extends Persona{

    private String curso;

    public Estudiante(String nombre, int edad, String curso) {
        super(nombre, edad);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void estudiar(){
        System.out.println(getNombre() + " estudia " + getCurso());
    }
}
