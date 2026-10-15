import java.io.*;
import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new FileReader("dir\\entrada1.txt"));
             PrintWriter pw = new PrintWriter(new FileWriter("dir\\salida1.txt",true));
        ){
            String linea;
            while(sc.hasNextLine()){ //con scanner hay que ponerlo asi
                linea = sc.nextLine(); //con esto leemos la entrada que esta vez es del texto
                pw.println(linea); // y la imprimimos
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }



    }
}