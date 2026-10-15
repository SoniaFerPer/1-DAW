package reloj;

public class RelojDigital extends Reloj implements Dibujable {

    public RelojDigital(int h, int m, int s) {
        super(h, m, s);
    }

    @Override
    public void dibujar() {
        String hora = toString();

        System.out.println("╭───────────────╮");
        System.out.println("│   " + hora + "   │");
        System.out.println("└───────────────┘");
    }
}
