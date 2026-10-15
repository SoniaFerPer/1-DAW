import java.util.Random;

public class quiniela {
    public static void main(String[] args) {
//        3 de cada 6 veces, será un "1"
//        2 de cada 6 veces, será una "X"
//        1 de cada 6 veces, será un "2"

        Random generador = new Random();
        int i, apuesta;
        for (i = 1; i <= 15; i++) {
            apuesta = generador.nextInt(7);
            System.out.printf("%2d: ", i);
            switch (apuesta) {
                case 1:
                case 2:
                case 3:
                    System.out.println("1");
                    break;
                case 4:
                case 5:
                    System.out.println("X");
                    break;
                default:
                    System.out.println("2");
            }
        }
    }
}
