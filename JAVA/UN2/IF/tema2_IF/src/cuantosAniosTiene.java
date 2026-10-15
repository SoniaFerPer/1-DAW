import java.util.Scanner;

public class cuantosAniosTiene {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int DA, MA, AA, DN, MN, AN, edad;

        System.out.print("Dime el dia que naciste: ");
        DN = sc.nextInt();
        System.out.print("Dime el mes que naciste: ");
        MN = sc.nextInt();
        System.out.print("Dime el anio que naciste: ");
        AN = sc.nextInt();
        System.out.print("Dime el dia en que estamos: ");
        DA = sc.nextInt();
        System.out.print("Dime el mes en que estamos: ");
        MA = sc.nextInt();
        System.out.print("Dime el anio en que estamos: ");
        AA = sc.nextInt();

        edad = AA -AN;
        if ((MN > MA) ||  ((MN == MA) && ( DN > DA))){
            edad = edad-1;
        }
        System.out.printf("Tienes %d años.",edad);




    }
}
