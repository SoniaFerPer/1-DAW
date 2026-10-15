import java.io.*;

public class ejer3 {
    public static void main(String[] args) {
    //PARA LEER Y ESCRIBIR HAY QUE PONER AMBOS EN EL PARENTESIS DEL TRY
        //usando el try al salir del try ya cierra automaticmente el buffer, HACE FLUSH
        try (BufferedReader br = new BufferedReader(new FileReader("dir\\salida.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("dir\\entrada.txt",true)); //ponemos true para no sobreescibir texto
        ){
            String linea;
            while((linea = br.readLine()) != null){ //LEEMOS LA LINEA MIENTRAS QUE SEA DISTINTO DE NULL
                bw.write(linea);  //LA ESCRIBIMOS EN EL OTRO TXT
                bw.newLine(); //SALTO DE LINEA PARA QUE NO SE ESCRIBA JUNTO EN EL SEGUNDO TEXTO
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}