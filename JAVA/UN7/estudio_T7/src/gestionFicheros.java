import java.io.File;
import java.io.IOException;

public class gestionFicheros {
    public static void main(String[] args){
        //CREAR FICHEROS pero no lo hace fisicamente
        File f = new File("dir/datos2.txt");
        //comprobar existencia
        f.exists();

        //crear fichero tiene que tener excepcion
        try {
            f.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //CREAR CARPETA
        f.mkdir();

        //CREAR VARIAS
        f.mkdirs();

        //BORRAR CARPETAS (NO LAS BORRA SI TIENEN CONTENIDO)
        f.delete();

        //TIPO DE FICHERO
        f.isFile();
        f.isDirectory();

        //NOMBRE Y RUTA
        f.getName();
        f.getPath();
        f.getAbsolutePath();

        //TAMAÑO
        f.length();

        //LISTAR CONTENIDO
        //OBTENER LISTA
        File carpeta = new File("dir");
        String[] lista = carpeta.list();

        //OBJETOS FILE
        File[] archivos = carpeta.listFiles();

        //RECORRER CARPETA
        for (File n : archivos) {
            System.out.println(n.getName());
        }

        //RUTA RELATIVA -> "datos.txt"
        //RUTA ABSOLUTA -> "C:\\carpeta\\a.txt"

        //TIPICO EN EXAMEN

        //crear fichero si no existe

        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {

            }
        }

        //LISTAR ARCHIVOS
        File dir = new File("dir");
        for (File s : dir.listFiles()) {
            System.out.println(s.getName());
        }

        //ruta canonica -> f.getCanonicalPath() -> Es la ruta absoluta “real” del fichero necesita un try catch
    }
    //RECORRER DIRECTORIOS
    public static void listar(File f) {
        if (f.isDirectory()) {
            for (File hijo : f.listFiles()) {
                listar(hijo);
            }
        } else {
            System.out.println(f.getName());
        }
    }
}
