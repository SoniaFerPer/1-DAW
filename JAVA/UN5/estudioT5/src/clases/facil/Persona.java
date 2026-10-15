package clases.facil;

public abstract class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void saludar(){
        System.out.println("Hola soy " + getNombre());
    }

}
