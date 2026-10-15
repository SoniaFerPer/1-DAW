import java.io.FileInputStream;
import java.io.IOException;


public class ejer3 {
    public static void main(String[] args) {
        String archivo = "doc";

        if (esPDF(archivo)) {
            System.out.println(archivo + " es un PDF.");
        } else {
            System.out.println(archivo + " NO es un PDF.");
        }

    }

    public static boolean esPDF(String nombreFichero){
        try (FileInputStream fis = new FileInputStream("dir\\doc.pdf")) {
            byte[] primeros5 = new byte[5];
            if (fis.read(primeros5) != 5) return false; // archivo muy corto
            String s = new String(primeros5, "ASCII");
            return s.equals("%PDF-");
        } catch (IOException e) {
            return false;
        }
    }

//    public static boolean esPDF(String nombreFichero) {
//        byte[] encabezadoPDF = "%PDF-".getBytes(); // convierte los caracteres a bytes
//        byte[] primerosBytes = new byte[encabezadoPDF.length];
//
//        try (FileInputStream fis = new FileInputStream(nombreFichero)) {
//            // lee los primeros bytes del fichero y comprueba si tiene minimo la longitud del encabezado pdf
//            if (fis.read(primerosBytes) != encabezadoPDF.length) {
//                return false; // el fichero es demasiado corto para ser un PDF
//            }
//
//            // comparar byte a byte
//            for (int i = 0; i < encabezadoPDF.length; i++) {
//                if (primerosBytes[i] != encabezadoPDF[i]) {
//                    return false; // no coincide con %PDF-
//                }
//            }
//            return true; // coincide, es un PDF
//
//        } catch (IOException e) {
//            return false;
//        }
//    }
}