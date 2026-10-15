import java.util.Random;

public class ejerSopa {
    static Random rnd = new Random();
    public static void main(String[] args) {
        int m = 15;
        dibujarSopa(generarSopa(m));
    }


    public static char[][] generarSopa(int n) {
        char[][] s = new char[n][n];
// Rellenar con elementos aleatorios
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                s[i][j] = (char) ('A' + rnd.nextInt(26));
            }
        }
        return s;
    }
    public static void dibujarSopa(char[][] s) {
// Mostrar la matriz
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (j > 0) System.out.print(' ');
                System.out.print(s[i][j]);
            }
            System.out.println();
        }
    }
}

