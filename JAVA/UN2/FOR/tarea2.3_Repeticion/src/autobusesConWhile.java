import java.util.Scanner;

public class autobusesConWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        while (true) {
            System.out.print("Personas del grupo (0=FIN): ");
            int grupo = sc.nextInt();

            if (grupo == 0) break;
            if (grupo < 0) {
                System.out.println("No puede ser negativo");
                continue;
            }

            total += grupo;
            System.out.println("Apuntados. Van " + total);
        }
        /*int capacidad = 55;
        int autobuses = total / capacidad;  // división entera

        if (total % capacidad != 0) {
            autobuses++;  // si sobra gente, hace falta un autobús más
        }*/
        int autobuses = (int) Math.ceil(total / 55.0); //esto es lo mismo que hace el modulo

        System.out.println("Son necesarios " + autobuses + " autobuses");
    }
}
