import java.util.Scanner;

public class boletinNotas {
    public static void main(String[] args){
        String resultado = "";
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce tu nota(0 a 10 con decimales): ");
        double nota = sc.nextDouble();


        //version con else if

        if (nota < 2){
            resultado = "Deficiente";
            System.out.println("Tu resultado en tu calificación es " + resultado);
        } else if (nota < 5) {
            resultado = "Insuficiente";
            System.out.println("Tu resultado en tu calificación es " + resultado);
        } else if (nota < 6) {
            resultado = "Suficiente";
            System.out.println("Tu resultado en tu calificación es " + resultado);
        } else if (nota < 7) {
            resultado = "Bien";
            System.out.println("Tu resultado en tu calificación es " + resultado);
        } else if (nota < 9) {
            resultado = "Notable";
            System.out.println("Tu resultado en tu calificación es " + resultado);
        } else if (nota >= 9 && nota <= 10) {
            resultado = "Sobresaliente";
            System.out.println("Tu resultado en tu calificación es " + resultado);
        }else {
            System.out.println("La nota es incorrecta.");
        }

        //version con if anidados

        if(nota == 0 || nota > 2) {
            resultado = "Deficiente";
        } if (nota >= 2 || nota < 5) {
            resultado = "Insuficiente";
        } if (nota >= 5 || nota < 6) {
            resultado = "Suficiente";
        } if (nota >= 6 || nota < 7) {
            resultado = "Bien";
        } if (nota >= 7 || nota < 9) {
            resultado = "Notable";
        } if (nota >= 9 || nota <= 10) {
            resultado = "Sobresaliente";
        } else {
            System.out.println("La nota es incorrecta.");
        }

        System.out.println("Tu resultado en tu calificación es " + resultado);
    }
}
