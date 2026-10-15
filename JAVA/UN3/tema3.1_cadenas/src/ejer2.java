import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String provincia = sc.nextLine();

        String cad1= provincia.substring(0,3);
        System.out.println(cad1);
        /*
         el parametro provincia.length()-2 le quita 3 posiciones (0,1,2)
         el parametro provincia.length me da hasta el final de la cadena pero no es necesario
        String cad2= provincia.substring(provincia.length()-2,provincia.length());
         */
        String cad2= provincia.substring(provincia.length()-2);
        System.out.println(cad2);
        String cad3;
        if(provincia.length()>=5){
            cad3 = provincia.substring(2, 5);
        }else {
            cad3 = provincia.substring(2, 4);
        }
        System.out.println(cad3);


    }
}
