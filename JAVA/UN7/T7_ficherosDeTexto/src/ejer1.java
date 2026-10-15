import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        try(FileWriter fw = new FileWriter("dir\\salida.txt")){
            fw.write(frase);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}