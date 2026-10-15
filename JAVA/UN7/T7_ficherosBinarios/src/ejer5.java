import java.io.FileInputStream;
import java.io.IOException;

public class ejer5 {
    public static void main(String[] args) {
        String ficheroA = "dir\\ficheroA.dat";
        String ficheroB = "dir\\ficheroB.dat";

        System.out.println(compararArchivos(ficheroA,ficheroB));


    }
    public static boolean compararArchivos(String ficheroA, String ficheroB){
        try(FileInputStream fis1 = new FileInputStream(ficheroA);
            FileInputStream fis2 = new FileInputStream(ficheroB)){
            int b1,b2;
            while (true){
                //METODO EFICIENTE LEER BYTE A BYTE Y DESPUES COMPARAR Y NO LEER TODO EL ARCHIVO
                b1 = fis1.read();
                b2 = fis2.read();

                //SI NO SON IGUALES PARA QUE SEGUIR
                if(b1 != b2){
                    return false;
                }
                //SON IGUALES ASIQUE AHORA CON LEER UNO COMPLETO VALE
                if(b1 == -1){
                    return true;
                }
            }
//            //VERSION CORTA
//            while ((b1 = fis1.read()) == (b2 = fis2.read())) {
//                if (b1 == -1) return true;
//            }
//            return false;

        }catch (IOException E){
            throw new IllegalArgumentException("No se puede abrir alguno de los ficheros");
        }
    }

}