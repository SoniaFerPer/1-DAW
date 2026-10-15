
public class Main {
    public static void main(String[] args) {

        //las matrices son array de dos dimensiones, tb llamados tablas

        //inicializar matriz
        int [][]lista=new int [3][4];

        //llenar matriz
        int[][] a= new int[][]{
                                {1,2,3,4},
                                {5,6,7,8},
                                {9,10,11,12}
                               };

        //leer todos los datos de matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%2d ", a[i][j]);
            }
            System.out.println();
        }

        //contar elementos de una matriz
        //con for each anidado
        for (int[] i : a) {
            for (int j : i) {
                System.out.printf("%d ", j);
            }
            System.out.println(); //para que salte entre filas
        }

        //con for normal anidado
        for(int i =0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println(); //para que salte entre filas
        }

        //declaracion poliedro
        int[][][] b= new int[2][3][4];

        //declaracion poliedro con datos
        int[][][] c= new int[][][]{
                                    {{1,2,3,4},
                                    {5,6,7,8},
                                    {9,10,11,12}}
        };


        //con poliedro es igual pero son tres for



    }
}