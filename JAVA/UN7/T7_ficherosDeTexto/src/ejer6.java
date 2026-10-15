import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args) {
        /*
        1.  LEEMOS UNA PALABRA POR SCANNER
        2.  LEEMOS EL DOCUMENTOS Y LEEMOS LA PRIMERA LINEA
        3.  CONTAMOS LAS LINEAS DEL DOCUMENTO
        4.  DENTRO DE ESA LINEA BUSCAMOS LA PALABRA CON CONTAINS, ES IMPORTANTE PONER TRIM
        5.  METEMOS CADA NUMERO DE LINEA EN UNA LISTA
        6.  IMPRIMIMOS LAS LINEAS DONDE SE ENCUENTRA LA PALABRA
         */

        Scanner sc = new Scanner(System.in);
        int numeroLinea = 0;

        List<Integer> lineas = new ArrayList<>();

        System.out.print("Introduce palabra a buscar: ");
        String palabra = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader("dir\\documento.txt"))){
        String linea;
            while((linea = br.readLine()) !=null){
                numeroLinea++;
                if(linea.trim().contains(palabra)){
                    lineas.add(numeroLinea);
                }

            }
        } catch (FileNotFoundException e) {
            System.err.println("fichero no encontrado.");
        }catch (IOException y){  // EL IO SIEMPRE DEBE APARACER PORQUE PUEDE DAR ERROR DE LECTURA
            System.err.println("Error al leer el fichero.");
        }

        //POR SI NO ENCUENTRA LA PALABRA
        if(lineas.isEmpty()){
            System.out.println("La palabra no aparece en el fichero.");
        }else{
            System.out.println("Aparece en las líneas: " + lineas);
        }

    }
}