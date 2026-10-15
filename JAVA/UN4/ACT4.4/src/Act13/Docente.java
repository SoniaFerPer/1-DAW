package Act13;

public class Docente {
    private final String nombre;
    private final String apellidos;
    private String especialidad;
    private final String NRP;

    public Docente(String nombre, String apellidos, String especialidad, String NRP) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
        this.NRP = NRP;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNRP() {
        return NRP;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellidos;
    }

    @Override
    public String toString() {
        return String.format("Docente: %s %s | Especialidad: %s | NRP: %s",
                nombre, apellidos, especialidad, NRP);
    }
}
