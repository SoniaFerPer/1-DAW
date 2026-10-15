import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cad,cad2="",cad3="";
        cad = sc.nextLine();

        String invertida = new StringBuilder(cad).reverse().toString();
        for (int i=0; i<cad.length(); i++){
            cad2 = String.valueOf(cad.charAt(i));
            cad3 = String.valueOf(invertida.charAt(i));
        }
        if (cad2.equals(cad3)){
            System.out.println("Son palindromos.");
        }else{
            System.out.println("No son palindromos.");
        }

        //METERLO EN UN BUCLE QUE TERMINE CON LINEA EN BLANCO
    }
}
