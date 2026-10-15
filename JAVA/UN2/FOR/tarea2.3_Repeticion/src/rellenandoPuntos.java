import java.util.Scanner;

public class rellenandoPuntos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String cadena;
        char caracter;

        System.out.println("Introduce una cadena, un numero entero positivo y un caracter (D o I): ");
        cadena = sc.nextLine();
        numero = sc.nextInt();
        caracter = sc.next().toUpperCase().charAt(0);
        int longitud = cadena.length();

        sc.nextLine(); // limpiar buffer si el programa ha leido muchos datos introducido por teclado
        sc.close();

        if (longitud > numero){
            System.out.println("La cadena no cabe en el espacio indicado.");
        }else{
            int cantidadPuntos = numero - cadena.length();
            if(caracter=='D'){
                for(int i =0; i < cantidadPuntos; i++){
                    cadena = cadena + ".";
                }
                System.out.println(cadena);

            }else if(caracter=='I'){
                for(int i =0; i < cantidadPuntos; i++){
                    cadena = "." + cadena;
                }
                System.out.println(cadena);
            }

            // ME COSTO LA CONDICION DEL FOR Y QUE DECLARABA EL PUNTO COMO CHAR Y ME DABA ERROR. TAMBIEN EL NEXTLINE EN CHAR NO SIRVE, DEBE SER NEXT
        }

    }

}
//><