import java.util.Scanner;

public class ejer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, anchura = 7;
        System.out.print("Dime un numero: ");
        num = sc.nextInt();
        sc.nextLine();

        //IGUAL QUE EL DE LAS RAYAS Y LOS IGUALES
        if(num%2 == 0){
            for(int i = 0; i < num; i++) {
                System.out.print("|");
                for (int j = 0; j < num + 1; j++) {
                    System.out.print("-");
                }
            System.out.println();

            }
        }else{
            
        }


    }
}
