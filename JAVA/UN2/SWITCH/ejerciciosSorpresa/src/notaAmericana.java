import java.util.Scanner;

public class notaAmericana {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Dime tu calificación(1-20): ");
        double nota = sc.nextDouble();
        char calificacion = 0;

        if(nota < 1 && nota > 20){
            System.out.print("Nota no válida.");
        }else if (nota >= 19 && nota <= 20){
            calificacion = 'A';
        }else if (nota >= 16){
            calificacion = 'B';
        }else if (nota >= 13 ){
            calificacion = 'C';
        }else if (nota >= 10) {
            calificacion = 'D';
        }else {
            calificacion = 'E';
        }

        System.out.println("Tu calificación es " + calificacion);

    }


}