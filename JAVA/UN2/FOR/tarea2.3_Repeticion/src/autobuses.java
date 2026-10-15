import java.util.Scanner;

public class autobuses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        INTENTAR AHORRAR LINEAS
        int autobus, Personas, contadorPersonas;
         */
        int autobus;
        int Personas;
        int contadorPersonas=0;
        do{
            System.out.println("Diga el número de personas: ");
            Personas = sc.nextInt();
            contadorPersonas = contadorPersonas + Personas;
            System.out.println("Van apuntados " + contadorPersonas + " personas.");
        }while(Personas != 0);

        autobus = contadorPersonas / 55;
        if(autobus % 55 !=0){
            autobus = autobus +1; //autobus++;
        }

        //MEJOR QUE CON IF Y MODULO ES MEJOR CON MATH.CEIL


        System.out.println("Se necesitan " + autobus + " autobuses.");

    }
}
