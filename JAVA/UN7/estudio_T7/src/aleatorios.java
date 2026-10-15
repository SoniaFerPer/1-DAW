import java.io.IOException;
import java.io.RandomAccessFile;

public class aleatorios {
    public static void main(String[] args){
//        //ESCRIBIR EN POSICION N
//        try(RandomAccessFile raf = new RandomAccessFile("dir/datos.dat", "rw")){
//            int n = 2;
//            raf.seek(n * Integer.BYTES);
//            raf.write(100);
//
//        }catch (IOException E){
//
//        }


        //LEER EN POSICION N
        try(RandomAccessFile raf = new RandomAccessFile("dir/datos.dat","r")){
            int d = 5; //MOVERTE AL INDICE 5, QUE EN REALIDAD SERIA LA 6 POSICION. PORQUE EL INDICE COMIENDA EN 0
            raf.seek(d * Integer.BYTES);

            int valor = raf.readInt(); //LEEMOS EL VALOR DE INDICE 5
            System.out.println(valor);

        }catch (IOException e){

        }

        //IR AL FINAL DE UN REGISTRO
//        raf.seek(raf.lengh());

        //NUMERO DE REGISTROS
        // int total = (int) (raf.length() / TAM);

        //LEER DATOS VARIADOS : STRING, INT ETC


    }
}
