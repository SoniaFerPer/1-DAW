import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String anio = sc.nextLine();
        String mes;
        try(RandomAccessFile raf = new RandomAccessFile(anio + ".dat","rw")){

            for(int i = 1;i < 13;i++){
                raf.writeBytes("mes" + i + ":");
                raf.writeDouble(Double.NaN);
            }

        }catch (FileNotFoundException f){
            System.out.print("archivo no encontrado");
        }
        catch (IOException e){
            System.err.println("Error en el archivo");
        }




    }
}