package estadisticasGlobales;

public class Estadisticas {
    static double [] lista = new double[100];
    static int indice = 0;

    public static double[] getLista() {
        return lista;
    }

    public static void agregarNumero(double x){
        if (indice < lista.length) {
            lista[indice] = x;
            indice++;
        }
    }

    public static double calcularMedia(){
            if (indice == 0) {
                return 0; // evita división entre 0
            }
            double suma = 0;

            for (int i = 0; i < indice; i++) {
                suma += lista[i];
            }
       return suma / indice;
    }

    public static double getMaximo(){
        if (indice == 0) return 0;
        double max = lista[0];

        for (int i = 1; i < indice; i++) {
            if (lista[i] > max) {
                max = lista[i];
            }
        }
        return max;
    }

    public static double getMinimo(){
        if (indice == 0) return 0;
        double min = lista[0];

        for (int i = 1; i < indice; i++) {
            if (lista[i] < min) {
                min = lista[i];
            }
        }
        return min;
    }
}
