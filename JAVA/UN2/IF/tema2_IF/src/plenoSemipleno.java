import java.util.Scanner;

public class plenoSemipleno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declaro y leo los bolos de cada tirada
        int tirada1,tirada2,tirada3,tirada4;

        System.out.println("Dime los bolos que has tirado en la primera tirada del primer turno: ");
        tirada1 = sc.nextInt();
        System.out.println("Dime los bolos que has tirado en la segunda tirada del primer turno: ");
        tirada2 = sc.nextInt();
        System.out.println("Dime los bolos que has tirado en la primera tirada del segundo turno: ");
        tirada3 = sc.nextInt();
        System.out.println("Dime los bolos que has tirado en la segunda tirada del segundo turno: ");
        tirada4 = sc.nextInt();

        //creo un contador con la puntuacion a cero y hay voy incluyendo el valor de las tiradas
        int puntuacion = 0;

        //tengo que hacer tres condiciones, una cuando haga pleno, otra cuando sea semipleno y si no hay ninguna de las dos
        if(tirada1 == 10){
            System.out.println("¡Has hecho pleno!");
            puntuacion = 10 + ((tirada3 + tirada4) * 2);

        }if((tirada1 != 10) && (tirada1 + tirada2 == 10)){
            System.out.println("¡Has hecho semipleno!");
            puntuacion = 10 + ((tirada3 * 2) + tirada4);

        }if(tirada1 + tirada2 != 10){
            puntuacion = tirada1 + tirada2 + tirada3 + tirada4;
        }
        System.out.printf("La puntuación total es igual a %d puntos.",puntuacion);

        //Aquí implementaría una excepción para evitar que el usuario introduzca
        // datos negativos y datos mayores a 10 bolos en cada turno
    }
}
