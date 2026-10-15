import java.util.Scanner;

public class sms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba el mensaje a enviar: ");
        String mensaje = sc.nextLine();

        double precio= 0.75;
        double precioLongitud=0.25;
        double IVA = 1.21;

        //aquí habría que poner 81 no? Porque si cuenta desde 0 en java habría que añadirle uno más

        if(mensaje.length() > 80){
            precio= precio + precioLongitud;
        }

        double precioTotal= precio*IVA;

        System.out.printf("El total a pagar por el mensaje es de %.2f €.", precioTotal);

        sc.close();
    }
}
