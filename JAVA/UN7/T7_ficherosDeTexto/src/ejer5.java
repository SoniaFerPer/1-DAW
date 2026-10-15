import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ejer5 {
    public static void main(String[] args) throws FileNotFoundException {
        int contadorLineas = 0;
        int contadorChar = 0;
        int contadorPalabras = 0;
        try(BufferedReader br = new BufferedReader(new FileReader("dir\\entrada1.txt"))){
            String linea;
            while((linea = br.readLine()) != null){ //GUARDAR LA LINEA EN EL STRING PARA PODER LUEGO CONTAR PALABRAS | AQUI YA YAMAMOS A LEER LINEA
                contadorLineas++;

                //CONTAR CHAR
                contadorChar += linea.length();

                //CONTAR PALABRAS
                if(!linea.trim().isEmpty()){ //ASI ELIMINAMOS ESXPACIOS Y LINEAS VACIAS PARA QUE NO LAS CUENTE
                    String[] palabras = linea.split("\\s+");
                    contadorPalabras += palabras.length;
                }

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println("total lineas: " + contadorLineas);
        System.out.println("total caracteres: " + contadorChar);
        System.out.println("total palabras: " + contadorPalabras);




    }
}