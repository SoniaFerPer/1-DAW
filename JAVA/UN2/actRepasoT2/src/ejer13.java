import java.util.Scanner;

public class ejer13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado,ancho;
        System.out.print("Dime el lado: ");
        lado = sc.nextInt();
        System.out.print("Dime el ancho: ");
        ancho = sc.nextInt();

        for(int i = 0; i < lado; i++) {
            for (int j = 0; j <= ancho-1; j++) {
                //Y ESTA MIERDA NO SE ME OCURRIA Y VENGA DARLE VUELTAS CON EL EJERCICIO DE LAS RAYAS Y LOS IGUALES UFFF
                if((i + j) % 2 == 0) {
                    System.out.print("*");
                }else{
                    System.out.print("#");
                }

            }
            System.out.println();

        }
    }
}



