import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ejer2 {
    public static void main(String[] args) {
        String archivo = "dir\\archivo.bin";

        Map<Integer, Integer> resultado = contarBytes(archivo);

        // Imprimimos solo los bytes que aparecen al menos una vez
        resultado.forEach((k, v) -> {
            if (v > 0) System.out.println(k + " -> " + v);
        });

        //SIN METODO
//        Map<Integer,Integer> asociarByte = new HashMap<>();
//        for (int i = 0; i <= 255; i++) {        //METEMOS DE 0 A 255 EN LA CLAVE DEL MAP
//            asociarByte.put(i, 0);
//        }
//
//        try(InputStream is = new FileInputStream("dir\\archivo.bin")){
//            int entero;
//            while ((entero = is.read()) != -1){
//                //LLENAMOS EL MAP, LA CLAVE SERIA EL ENTERO QUE SE LEE Y EL VALOR ESE ENTERO +1 PORQUE AL FINAL ES UN NUMERO DEL 0 AL 255
//                asociarByte.put(entero, asociarByte.get(entero) + 1);
//            }
//
//        }catch (IOException e){
//            asociarByte.clear();  //SI NO HAY NINGUN NUMERO DEVOLVEMOS EL MAPA VACIO, CON LIMPIARLO VALE
//        }
//
//        //IMPRIMIMOS SOLO EL BYTE QUE HAN CONTADO
//        asociarByte.forEach((k, v) -> { if(v>0) System.out.println(k + " -> " + v); });
    }

    public static Map<Integer, Integer> contarBytes(String nombreFichero) {
        Map<Integer, Integer> asociarByte = new HashMap<>();

        // Inicializamos todas las claves de 0 a 255 con valor 0
        for (int i = 0; i <= 255; i++) {
            asociarByte.put(i, 0);
        }

        try (InputStream is = new FileInputStream(nombreFichero)) {
            int entero;
            while ((entero = is.read()) != -1) {
                // Incrementamos el contador del byte leído
                asociarByte.put(entero, asociarByte.get(entero) + 1);
            }
        } catch (IOException e) {
            // si hay error (fichero no existe, etc.) devolvemos mapa vacío
            asociarByte.clear();
        }

        return asociarByte;
    }

}