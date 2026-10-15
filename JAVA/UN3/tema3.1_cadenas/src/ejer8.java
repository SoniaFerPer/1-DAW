import java.util.Scanner;

public class ejer8 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String cad=sc.nextLine();
    StringBuilder resultado = new StringBuilder();
    int suma =0;
    String numeroActual = "";
    //al añadirme un espacio garantizamos que el ultimo caracter nunca sera un digito
    cad += " ";

    for(int i=0;i<cad.length();i++){
        char numeros= cad.charAt(i);
        if(Character.isDigit(numeros)){
            numeroActual +=numeros;

        }else if (!numeroActual.isEmpty()) {
            resultado.append(numeroActual).append("\n");
            suma += Integer.parseInt(numeroActual);
            numeroActual="";
            }

    }

        System.out.println(resultado);
        System.out.println("Total: " + suma);

    }

}
