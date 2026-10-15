import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String cad1=sc.nextLine();

        for(int i=0;i<cad1.length();i++){
            String cad2 = cad1.substring(0,i+1);
            System.out.println(cad2);
        }


        for(int i=cad1.length();i>=0;i--){
            String cad2 = cad1.substring(i-1); //TENGO QUE INDICAR DONDE EMPIEZA, PERO DONDE ACABA NO
            System.out.println(cad2);
        }


    }
}
