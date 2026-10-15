import java.util.Map;
import java.util.TreeMap;

public class ejer3 {
    public static void main(String[] args) {
        Map<Integer,String> socios = new TreeMap<>();
        socios.putIfAbsent(50, "Carlos");
        socios.putIfAbsent(10, "Ana");
        socios.putIfAbsent(40, "Beatriz");
        socios.putIfAbsent(20, "David");
        //no lo hace ya que esa key ya esta añadida y no permite el cambio lanza una excepcion

        String existente = socios.putIfAbsent(10,"Dolores");
        if(existente != null){
            System.out.println("El id 10 ya existe.");
        }

        //CON LAMBDA
        socios.keySet().forEach(System.out::println);
        //CON FOREACH
        for(Integer i : socios.keySet()){
            System.out.println(i);
        }

        //da error al añadir null, porque treeMap no permite key nulos, pero como obliga a que se ordenen de menor a mayor, nos indica que quiere un TreeMap
        try{
            socios.put(null,"Invitado Especial");
        }catch (NullPointerException e){
            System.out.println("El treeMap compara con el key, si es nulo no puede compara.");
        }



    }
}