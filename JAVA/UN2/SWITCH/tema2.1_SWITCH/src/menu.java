import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(
                "seleccione una opción:\n" +
                "E. Entrantes\n" +
                "1. Primeros platos\n" +
                "2. Segundos platos\n" +
                "P. Postres\n"
        );
        char letra=sc.nextLine().charAt(0);

        switch (letra){
            case 'E':
            case 'e':
                System.out.println("Tartar de salmón ahumado y aguacate");
                System.out.println("Bocados de queso con mermelada de tomate casero");
                break;
            case '1':
                System.out.println("Salmorejo cordobés");
                System.out.println("Risotto de calabaza y boletus");
                break;
            case '2':
                System.out.println("Lasaña de carne a la boloñesa");
                System.out.println("Bacalao con salsa de almendras");
                break;
            case 'P':
            case 'p':
                System.out.println("Flan de huevo");
                System.out.println("Tarta tres chocolates");
                break;
            default:
                System.out.println("Opción incorrecta.");
                break;

        }

    }
}
