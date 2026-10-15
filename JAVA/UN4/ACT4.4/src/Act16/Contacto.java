package Act16;

public class Contacto {
    private String nombre;
    private String apellidos;
    private String telefono;

    public Contacto(String nombre, String apellidos, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellidos() { return apellidos; }
    public String getTelefono() { return telefono; }

    public String getNombreCompleto() {
        return String.format("Nombre: %-10s | Apellidos: %-15s | Tel: %s",
                nombre, apellidos, telefono);
    }
}
