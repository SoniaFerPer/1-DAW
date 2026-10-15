import java.util.Scanner;

public class dibujarTriangulo {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el número de asteriscos: ");
        n=sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    /*
    EXPLICACION: CON 5 ASTERISCOS
    I=1 I=2 I=3 I=4 I=5   NUMERO DE COLUMNAS
    J=1 J=2 J=3 J=4 J=5     NUMERO DE FILAS
     */
}
