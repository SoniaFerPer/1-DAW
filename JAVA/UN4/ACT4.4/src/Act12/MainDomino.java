package Act12;

public class MainDomino {
    public static void main(String[] args) {
        try {
            // a) Instanciar objetos
            Domino f1 = new Domino(3, 3);
            Domino f2 = new Domino(3, 5);
            Domino f3 = new Domino(6, 0);

            // Probar dibujar
            System.out.print("Ficha 1: "); f1.dibujar();
            System.out.print("Ficha 2: "); f2.dibujar();
            System.out.print("Ficha 3: "); f3.dibujar();

            // Probar puntos y dobles
            System.out.println("¿Ficha 1 es doble?: " + f1.esDoble());
            System.out.println("Puntos de Ficha 2: " + f2.getPuntos());

            // Probar conexión
            System.out.println("¿F1 conecta con F2?: " + f1.conectaCon(f2)); // Sí (el 3)
            System.out.println("¿F2 conecta con F3?: " + f2.conectaCon(f3)); // No

            // b) Probar excepción (esto lanzará error)
            System.out.println("Intentando crear ficha inválida (7, 2)...");
            Domino fError = new Domino(7, 2);

        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
