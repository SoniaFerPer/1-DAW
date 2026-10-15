import java.util.Scanner;

public class ejer6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String cad=sc.nextLine();
        boolean repetir = false;

        for (int i =0; i< cad.length();i++){
            for (int j = 0 ; j<cad.length();j++){
                if(i!=j) {
                    if(cad.charAt(i) == cad.charAt(j)){
                        repetir =true;
                    }
                }
            }
        }
        if(repetir) System.out.println("SI");
        else System.out.println("NO");

    }

}
