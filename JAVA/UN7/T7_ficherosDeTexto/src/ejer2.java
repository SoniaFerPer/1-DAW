
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("dir\\salida.txt", true))){
            while(true){
                String frase = sc.nextLine();
                if (frase.equalsIgnoreCase("FIN")) break;
                bw.write(frase);
                bw.newLine();
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }



    }
}