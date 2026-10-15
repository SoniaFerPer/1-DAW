import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class binarioConGestionArchivo {
    public static void main(String[] args){

    }
    public static boolean comparar (File f1, File f2) throws IOException {
        byte[] archivo1 = Files.readAllBytes(f1.toPath());
        byte[] archivo2 = Files.readAllBytes(f2.toPath());

        if(archivo1.length != archivo2.length) return false;

        for(int i = 0 ; i < archivo1.length ; i++){
            if(archivo1[i] != archivo2[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean compararConCadenas(String cad1, String cad2) throws IOException {
        return comparar(new File(cad1),new File(cad2));
    }
    public static boolean compararCadFile(String cad1, File f1) throws IOException {
        return comparar(new File(cad1),f1);
    }



}
