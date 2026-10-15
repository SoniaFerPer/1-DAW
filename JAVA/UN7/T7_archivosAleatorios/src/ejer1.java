import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class ejer1 {
    public static void main(String[] args) {
        Random rand = new Random();
    try(RandomAccessFile raf = new RandomAccessFile("dir\\aleatorio.dat","rw")){
        int num = rand.nextInt(1,1000);
        for(int i = 0;i <= 10;i++){
            raf.writeInt(num);
        }

        raf.read()

    }catch (FileNotFoundException e){
        System.err.println("No existe el archivo");
    }catch (IOException e){
        System.err.println("Error al acceder al fichero");
    }

    }
}