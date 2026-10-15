package Act13;

public class Estudiante {
    private String nombre;
    private String apellidos;
    private int NIE; // Número de Identificador Escolar (entero)

    public Estudiante(String nombre, String apellidos, int NIE) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIE = NIE;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNIE() {
        return NIE;
    }

    public void setNIE(int NIE) {
        this.NIE = NIE;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellidos;
    }

    @Override
    public String toString() {
        return String.format("Estudiante: %s %s | NIE: %d", nombre, apellidos, NIE);
    }
}
