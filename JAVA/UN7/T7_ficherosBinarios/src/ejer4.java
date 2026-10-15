import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ejer4 {
    public static void main(String[] args) {
        String entrada = "dir\\entrada.bin";
        String salida = "dir\\salida.bin";
        int buscar = 55;
        int reemplazar = 22;
        reemplazar(entrada,salida,buscar,reemplazar);


    }
    public static void reemplazar(String ficheroE,String ficheroS,int buscar, int reemplazar){
        //COMPROBAMOS SI LOS NUMEROS ESTAN EN EL RANGO SINO EXCEPCION
        if (buscar < 0 || buscar > 255 || reemplazar < 0 || reemplazar > 255) {
            throw new IllegalArgumentException("Los valores deben estar entre 0 y 255");
        }

        try(FileInputStream fis = new FileInputStream(ficheroE);
            FileOutputStream fos = new FileOutputStream(ficheroS)){

            int b;
        while((b = fis.read()) != -1){
            //SI B ES IGUAL AL NUMERO QUE BUSCAMOS REEMPLAZAMOS B POR EL NUMERO QUE QUEREMOS
            if(b == buscar) b = reemplazar;
            //Y LO ESCRIBIMOS EN EL ARCHIVO DE SALIDA
            fos.write(b);
        }
        }catch (IOException E){
            System.err.println("El archivo no se encuentra.");
        }
    }
    //MOSTRAR BYTES
    public static void mostrar(String fichero) {
        try (FileInputStream fis = new FileInputStream(fichero)) {

            int b;

            while ((b = fis.read()) != -1) {
                System.out.print(b + " ");
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }

}