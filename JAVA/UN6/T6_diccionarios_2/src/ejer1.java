import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejer1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Map<String,String> colores = new HashMap<>();
        colores.put("azul" ,"blue");
        colores.put("amarillo" ,"yellow");
        colores.put("rojo" ,"red");
        colores.put("morado" ,"purple");
        colores.put("verde" ,"green");

        while(true){
            String pide = sc.next().trim();
            sc.nextLine();
            if(pide.equals("FIN")) break;
            String color = colores.getOrDefault(pide,"no encontrado");
            System.out.println(color);
        }




    }
}