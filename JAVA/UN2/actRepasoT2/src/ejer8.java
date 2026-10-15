import java.util.Scanner;

public class ejer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Dime un numero: ");
        num = sc.nextInt();
        sc.nextLine();

        //IGUAL QUE EL DE LAS RAYAS Y LOS IGUALES
        for(int i = 0; i < num; i++) {
            if(i%2==0){
                System.out.println("|   |");
            }else{
                System.out.println("|---|");
            }
        }
    }
}
