import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ejer1 {
    public static void main(String[] args) {
        String archivo = "dir\\archivo.bin";
        int totalBytes = contarBytes(archivo);

        if (totalBytes != -1) {
            System.out.println("El fichero tiene " + totalBytes + " bytes.");
        } else {
            System.out.println("No se pudo leer el fichero.");
        }

    }
    // --- MÉTODO QUE CUENTA EL NÚMERO TOTAL DE BYTES EN UN FICHERO ---
    public static int contarBytes(String nombreFichero) {
        int contadorByte = 0;

        try (InputStream is = new FileInputStream(nombreFichero)) {
            int entero;
            while ((entero = is.read()) != -1) { // -1 indica fin del fichero
                contadorByte++;
            }
        } catch (IOException e) {
            System.err.println("Error al abrir o leer el archivo: " + nombreFichero);
            return -1; // devolvemos -1 si hay error
        }

        return contadorByte;
    }
}