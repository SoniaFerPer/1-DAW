package asociacion;

public class Main {
    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca("Linares");
        Libro l1 = new Libro("El Hobbit", "Tolkien");
        Libro l2 = new Libro("Cronicas de narnia", "Tolkien");
        Libro l3 = new Libro("El medico", "Tolkien");

        b1.agregarLibro(l1);
        b1.agregarLibro(l2);
        b1.agregarLibro(l3);

        b1.mostrarLibros();
    }
}
