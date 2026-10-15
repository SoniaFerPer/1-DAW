import java.util.Scanner;

public class ejer3_err {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int squares = 8, n = 0; // tablero de 8x8

        while(n<3){
            System.out.print("Introduce el tamaño de cada casilla (mínimo 3): ");
            n = sc.nextInt();
            sc.nextLine();

        }

        System.out.print("Introduce el carácter para las casillas negras: ");
        char simbolo = sc.nextLine().charAt(0);


        // Construimos la línea del borde
        String borde = "+";
        for (int i = 0; i < squares; i++) {
            for (int j = 0; j < n; j++){
                borde += "-";
            }
            borde += "+";
        }

        // Recorremos cada fila del tablero
        for (int fila = 0; fila < squares; fila++) {
            System.out.println(borde); // línea superior de esa fila de casillas

            // Cada casilla tiene n líneas de alto
            for (int linea = 0; linea < n; linea++) {

                // Recorremos las columnas (las 8 casillas)
                for (int col = 0; col < squares; col++) {
                    System.out.print("|");

                    // Calculamos si la casilla es negra o blanca
                    boolean negra = (fila + col) % 2 != 0;

                    // Dibujamos el contenido de la casilla
                    for (int k = 0; k < n; k++) {
                        if (negra) System.out.print(simbolo);
                        else System.out.print(" ");
                    }
                }
                System.out.println("|"); // borde derecho final de la línea
            }
        }

        // Última línea inferior del tablero
        System.out.println(borde);
    }
}
