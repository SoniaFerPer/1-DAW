public class claseCharacter {
    public  static void main (String [] args){
        String s= "Hola123";
        char letra = s.charAt(4);
       // System.out.println(letra);
        if(Character.isLetter(letra)){
            System.out.println("es una letra");
        }else{
            System.out.println("es un digito");
        }
        if(Character.isUpperCase(letra)){
            System.out.println("mayuscula");
        }else if(Character.isLowerCase(letra)){
            System.out.println("minuscula");
        }else{
            System.out.println("no tiene mayusculas ni minusculas");
        }

    }
}
