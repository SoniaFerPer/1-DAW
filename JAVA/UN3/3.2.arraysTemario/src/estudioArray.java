
public class estudioArray {
    public static void main(String[] args) {
        int suma=0;


        //declarar array nulo
        int [] secuencia;

        //declarar un array con 10 elementos
        int [] datos=new int[10];

        //añadir datos al array /posicion 0 de tamaño 10
        datos[0]=1;

        //leer el tamaño de un array
        System.out.println(datos.length);

        //porque hay que poner -1 para leer los datos pooorque solo hay posiciones 0-9 asique posicion 10 no existe
        //datos[10]=1; //este da error : Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10 at estudioArray.main(estudioArray.java:17)
        //el ultimo sera:
        datos[9]=6;

        //para leer todos los datos usaremos un for pero es mejor un for each
        for(int i=0;i<datos.length;i++){
            //System.out.println(datos[i]);
        //sumar los numeros del vector
        suma += datos[i];

        }
        System.out.println(suma);

        // FOR EACH
        //tiene que ser el mismo tipo de dato que el vector que vayamos a recorrer
        // hace lo mismo que el for normal anterior
        for (int elemento : datos){
           System.out.println(elemento);
        }



    }
}