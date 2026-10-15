import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class ejer2 {
    public static void main(String[] args) {
        Random rand = new Random();
        try(RandomAccessFile raf = new RandomAccessFile("dir\\aleatorio1.dat","rw")){
            int num;
            for(int i = 0;i < 10;i++){
                num = rand.nextInt(1,1000);
                raf.writeInt(num);
                System.out.print(num + " ");
            }
            System.out.println();

            //hay que volver al principio del fichero para que empiece a leer
            raf.seek(0);

            for(int i = 0;i < 10;i++){
                num = raf.readInt();
                if(num % 2 != 0) {
                    raf.seek(raf.getFilePointer() - 4); //CLARO, TIENE QUE VOLVER ATRAS PARA REEMPLAZAR EL NUMERO LEIDO PORQUE UN INT VALE 4 BYTE
                    raf.writeInt(0);
                    System.out.print(num + " ");
                }
            }




        }catch (FileNotFoundException e){
            System.err.println("No existe el archivo");
        }catch (IOException e){
            System.err.println("Error al acceder al fichero");
        }

    }
}