import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Dime un numero: ");
        num = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < num; i++){
            System.out.println("\\");
            //SI NO PONGO MAS UNO, EN LA PRIMERA Y SEGUNDA FILA NO HACE EL ESPACIO, PORQUE I = 0 Y COMO J TB ES 0 ESE BUCLE NO LO HACE
            for(int j = 0; j < i+1; j++){
                System.out.print(" ");
            }
        }
    }
}
