package clases.media;

public class Main {
    public static void main(String[] args) {

        Modulo m1 = new Modulo("Programacion","Alicia");
        Modulo m2 = new Modulo("BBDD","Alicia");
        Modulo m3 = new Modulo("Sistemas","Alicia");

        Estudiante es = new Estudiante("Ana");
        es.agregarModulo(m1);
        es.agregarModulo(m2);
        es.agregarModulo(m3);
        System.out.println(es.getNombreAlumno());
        es.mostrarModulos();
    }
}
