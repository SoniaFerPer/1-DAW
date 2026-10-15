import java.util.Scanner;

public class EjComprobarEuromillones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[50];
        int[] estrellas = new int[12];

        //OTRO METODO ES COMPARAR UN ARRAY CON OTRO ARRAY Y GUARDAR EN UN ARRAY DONDE SE HA GANADO
// Leer la combinación de números ganadora
        for (int i = 0; i < 5; i++) {
            int n;
            n = sc.nextInt();
            numeros[n - 1] = 1;
        }
// Leer la combinación de estrellas ganadora
        for (int i = 0; i < 2; i++) {
            int n;
            n = sc.nextInt();
            estrellas[n - 1] = 1;
        }
        boolean salir = false;
        do {
            int n;
            int aciertosNum = 0;
            int aciertosEstr = 0;
// Leer números de apuesta
            for (int i = 0; i < 5; i++) {
                n = sc.nextInt();
                if (n == 0) {
                    salir = true;
                } else {
                    if (numeros[n - 1] == 1) aciertosNum++;
                }
            }
// Leer estrellas de apuesta
            for (int i = 0; i < 2; i++) {
                n = sc.nextInt();
                if (n == 0) {
                    salir = true;
                } else {
                    if (estrellas[n - 1] == 1) aciertosEstr++;
                }
            }
            if (!salir) {
                System.out.printf("%d %d\n",
                        aciertosNum, aciertosEstr);
            }
        } while (!salir);
    }
}