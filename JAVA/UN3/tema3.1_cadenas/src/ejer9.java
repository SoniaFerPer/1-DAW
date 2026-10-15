import java.util.Scanner;

public class ejer9 {
    public static void main(String[] args) {
        String cad,cadena;
        int contadorChar;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el caracter: ");
        char caracter=sc.next().charAt(0);
        sc.nextLine();

        do{
            cadena = sc.nextLine();

            if (cadena.isEmpty()) {
                break; // Salir si la cadena está vacía
            }

            contadorChar = 0; // Reiniciar contador para cada cadena

            for(int i=0;i<cadena.length();i++) {
                cad = Character.toString(cadena.charAt(i));
                if (cad.contains(caracter + "")) {
                    contadorChar++;
                }
            }

            if(contadorChar==0){
                System.out.println(-1);
            }else if(contadorChar==1){
                System.out.println(0);
            }else{
                System.out.println(contadorChar);
            }

        }while(!cadena.isEmpty());

    }
}
