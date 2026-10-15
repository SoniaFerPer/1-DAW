import java.util.Scanner;

public class ejer4 {
    static int contadorA=0,contadorE=0,contadorI=0,contadorO=0,contadorU=0;
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        String cad1=sc.nextLine();
        for(int i=0;i<cad1.length();i++){
            String letra = String.valueOf(cad1.charAt(i));
            vocales(letra);
        }

        if(contadorA>0){
            System.out.println("'A' -> " + contadorA);
        }if(contadorE>0){
            System.out.println("'E' -> " + contadorE);
        }if(contadorI>0){
            System.out.println("'I' -> " + contadorI);
        }if(contadorO>0){
            System.out.println("'o' -> " + contadorO);
        }if(contadorU>0){
            System.out.println("'U' -> " + contadorU);
        }

    }
    public static int vocales(String cad){
        return switch (cad) {
            case "a", "A" ->  contadorA++;
            case "e", "E" ->  contadorE++;
            case "i", "I" ->  contadorI++;
            case "o", "O" ->  contadorO++;
            case "u", "U" ->  contadorU++;
            default -> ' ';
        };
    }
}
