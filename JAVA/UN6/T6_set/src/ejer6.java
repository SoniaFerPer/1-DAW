import java.util.*;

public class ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> conjuntoA = new HashSet<>();
        Set<String> conjuntoB = new HashSet<>();

        while(true){
            String palabra1 = sc.next().toUpperCase();
            if(palabra1.trim().equals("FIN")) break;
            conjuntoA.add(palabra1);
        }
        System.out.println();
        while(true){
            String palabra2 = sc.next().toUpperCase();
            if(palabra2.trim().equals("FIN")) break;
            conjuntoB.add(palabra2);
        }
        //HAY QUE TRANSFORMARLOS EN TREESET PARA QUE SE ORDENEN
        Set<String> ordenadoA = new TreeSet<>(conjuntoA);
        Set<String> ordenadoB = new TreeSet<>(conjuntoB);
        System.out.println(ordenadoA + "\n" + ordenadoB);

        //PARA MOSTRAR PALABRAS EN COMUN DE DOS LISTAS, CREAMOS UNA NUEVA, LA COMPARAMOS Y VOLCAMOS EL RESULTADO
        Set<String> comunAlfa = new TreeSet<>(conjuntoA); // primer lista

        comunAlfa.retainAll(conjuntoB); //segunda lista
        System.out.println(comunAlfa);

        //MOSTRAR PALABRAS EN A QUE NO APAREZCAN EN B
        Set<String> soloEnA = new TreeSet<>(conjuntoA); // primer lista
        soloEnA.removeAll(conjuntoB);
        System.out.println(soloEnA);

        //MOSTRAR PALABRAS EN B QUE NO APAREZCAN EN A - IGUAL QUE ARRIBA PERO CON B
        Set<String> soloEnB = new TreeSet<>(conjuntoB); // primer lista
        soloEnB.removeAll(conjuntoA);
        System.out.println(soloEnB);
    }
}