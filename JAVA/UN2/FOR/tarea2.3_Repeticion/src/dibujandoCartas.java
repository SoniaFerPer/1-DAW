import java.util.Scanner;

public class dibujandoCartas {
    public static void main(String[] args) {
        String simbolo ="";
        String carta ="";
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de carta (1-12): ");
        int numero = sc.nextInt();
        System.out.println("Introduce el palo del carta (E-C-B-O): ");
        char palo = sc.next().toUpperCase().charAt(0);

//NO SE PORQUE AL COPIAR EL UNICODE A VECES SE COPIA LA FORMA Y OTRAS EL CODIGO DE UNICODE :(

        switch(numero){
            case 1:
                carta ="\uD83C\uDD70";
                break;
            case 2:
                carta = "2";
                break;
            case 3:
                carta = "3";
                break;
            case 4:
                carta = "4";
                break;
            case 5:
                carta = "5";
                break;
            case 6:
                carta = "6";
                break;
            case 7:
                carta ="7";
                break;
            case 10:
                carta = "\uD83E\uDD3A";
                break;
            case 11:
                carta = "\uD83C\uDFC7";
                break;
            case 12:
                carta = "👑";
                break;
            default:
                System.out.println("No existe el numero de carta!");
                break;
        }
        switch (palo) {
            case 'E':
                simbolo = "⚔️";
                break;
            case 'C':
                simbolo = "🍷";
                break;
            case 'B':
                simbolo = "🪵";
                break;
            case 'O':
                simbolo = "🪙";
                break;
            default:
                System.out.println("No existe el palo de la carta!");
                break;
        }

//        //HAY ALGUNA FORMA DE QUE LOS CARACTERES OCUPEN EL MISMO ESPACIO? HE LEIDO ALGO DE STRING FORMAT, PERO NO SE SI CON ESO SE QUEDARIAN PAREJOS LOS DIBUJOS
//        String cartaAsEspadas =
//                "╔════════════╗\n" +
//                "║ " + carta + "         ║\n" +
//                "║            ║\n" +
//                "║     " + simbolo +"     ║\n" +
//                "║            ║\n" +
//                "║         " + carta + " ║\n" +
//                "╚════════════╝";
//
//        System.out.println(cartaAsEspadas);

        //con bucle
        // Dibujo de carta
        System.out.println("+------------+");
        System.out.printf("| %-10s |\n", carta);
        System.out.printf("| %-10s |\n", palo);
        for (int i = 0; i < 5; i++) {
            System.out.println("|            |");
        }
        System.out.printf("| %10s |\n", carta);
        System.out.println("+------------+");
    }
}
