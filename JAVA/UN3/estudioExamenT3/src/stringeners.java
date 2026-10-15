public class stringeners {
    public static void main(String[] args){
        String cad = "hola";
        StringBuilder sb = new StringBuilder(cad);
        for(int i = 0 ; i<10;i++){
            sb.append(" mundo");
        }
        System.out.println(sb);
        String resultado = sb.substring(0,4);
        System.out.println(resultado);

    }
}
