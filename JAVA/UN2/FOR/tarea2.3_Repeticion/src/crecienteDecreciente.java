import java.util.Scanner;

public class crecienteDecreciente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero,numAnt;
        boolean creciente=true, decreciente=true;

        System.out.print("Introduce un numero: ");
        numAnt = sc.nextInt();

        if(numAnt < 0){
            System.out.println("No sirven números negativos.");
        }

        do {
            System.out.print("Introduce un numero: ");
            numero = sc.nextInt();
            if (numero > 0){
                if (numero > numAnt) {
                    decreciente = false;
                } else if (numero < numAnt) {
                    creciente = false;
                }else{
                    creciente = false;
                    decreciente = false;
                }
            numAnt = numero;
            }

        }while(numero > 0);

        if(creciente && !decreciente){
            System.out.println("Los números fueron introducidos en orden creciente.");
        }else {
            System.out.println("Los números fueron introducidos en orden decreciente.");
        }
    }


    //he tenido muchos problemas en el if interior no se me ocurria ponerlo con boolean
}
