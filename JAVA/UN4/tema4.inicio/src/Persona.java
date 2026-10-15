public class Persona {
    String nombre;
    String apellidos;
    String DNI;
    int nivelAcceso;
    boolean activo;

    String devolverNombre(){
        return "nombre y apellidos: " + nombre + apellidos;
    }

    void registrarEntrada() {
        System.out.println(devolverNombre() +
                " ha entrado");
    }
    void registrarSalida() {
        System.out.println(devolverNombre() +
                " ha salido");
    }

    void activar(){
       activo = true;
    }
    void desactivar(){
       activo = false;
    }

    void imprimirDatos (){
        System.out.println(devolverNombre() +
                "DNI" + DNI);
    }

}
