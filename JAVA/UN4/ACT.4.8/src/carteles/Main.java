package carteles;

public class Main {
    public static void main(String[] args) {
     Cartel c = new Cartel("HOLA MUNDO", 20);
     c.dibujar();
     c.setAlineacion(Alineacion.DERECHA);
     c.dibujar();
     c.setAlineacion(Alineacion.IZQUIERDA);
     c.dibujar();

    }
}