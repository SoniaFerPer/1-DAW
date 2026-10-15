import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class ejer1 {
    public static void main(String[] args) {
        Random rand = new Random();
    try(RandomAccessFile raf = new RandomAccessFile("dir\\aleatorio.dat","rw")){
        for(int i = 0;i < 10;i++){
            int num = rand.nextInt(1,1000);
            raf.writeInt(num);
            System.out.print(num + "\n");
        }

        System.out.println("\nLeyendo el fichero al revés:");

        // Leer desde el final hacia el principio
        for (int i = 9; i >= 0; i--) {
            raf.seek(i * 4); // cada int ocupa 4 bytes
            int num1 = raf.readInt();
            System.out.println("Posición " + i + " -> " + num1);
        }

    }catch (FileNotFoundException e){
        System.err.println("No existe el archivo");
    }catch (IOException e){
        System.err.println("Error al acceder al fichero");
    }

    }
}