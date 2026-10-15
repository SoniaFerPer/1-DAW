import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String cad=sc.nextLine();
        StringBuilder resultado = new StringBuilder();

        for(int i =0;i<cad.length();i++){
            char letra =cad.charAt(i);
            if(Character.isLetter(letra)){
                resultado.append(letra);
            }else{
                resultado.append(" ");
            }
        }
        //con esto eliminamos todos los espacios menos 1
        //El replaceAll(" +", " ") usa una expresión regular donde " +" significa "uno o más espacios", y los reemplaza por un solo espacio.
        String final_resultado = resultado.toString().replaceAll(" +", " ").trim();
        System.out.println(final_resultado);

    }
}
