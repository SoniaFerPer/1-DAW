import java.util.Random;

public class ejer3 {

    static Random random = new Random();
    static char [][] tablero = new char[3][3];

    public static void main(String[] args) {

        // Inicializar tablero vacío
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }

        char jugador = 'X';
        int movimientos = 0;

        // Bucle principal del juego
        while (true) {

            // Colocar ficha aleatoriamente
            int fila, col;
            do {
                fila = random.nextInt(3);
                col = random.nextInt(3);
            } while (tablero[fila][col] != ' '); // repetir si ya está ocupado

            tablero[fila][col] = jugador;
            movimientos++;

            System.out.println("Jugador " + jugador + " coloca en (" + fila + ", " + col + ")");
            mostrarTablero();

            // Comprobar ganador
            if (hayGanador(jugador)) {
                System.out.println("¡Jugador " + jugador + " gana!");
                break;
            }

            // Empate
            if (movimientos == 9) {
                System.out.println("Empate. No quedan posiciones.");
                break;
            }

            // Cambiar de jugador
            jugador = (jugador == 'X') ? 'O' : 'X';
        }
    }

    public static void mostrarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static boolean hayGanador(char j) {

        // Filas y columnas
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0] == j && tablero[i][1] == j && tablero[i][2] == j) ||
                    (tablero[0][i] == j && tablero[1][i] == j && tablero[2][i] == j)) {
                return true;
            }
        }

        // Diagonales
        if ((tablero[0][0] == j && tablero[1][1] == j && tablero[2][2] == j) ||
                (tablero[0][2] == j && tablero[1][1] == j && tablero[2][0] == j)) {
            return true;
        }

        return false;
    }
}