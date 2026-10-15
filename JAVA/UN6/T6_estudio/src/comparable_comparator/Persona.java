package comparable_comparator;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
    //ORDENARA POR EDAD = COMPARE
//    @Override
//    public int compareTo(Persona o) {
//        return Integer.compare(this.edad,o.edad);
//    }

   //POR NOMBRE = COMPARETO
    @Override
    public int compareTo(Persona o) {
        return this.nombre.compareTo(o.nombre);
    }
}
