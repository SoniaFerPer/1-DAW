package composicion;

public class Main {
    public static void main(String[] args){
        Motor m1 = new Motor("hibrido", "120cv");
        Coche c1 = new Coche("Toyota","Corolla", m1);

        System.out.println(c1); //al crear toString en la clase no hace falta usarlo como metodo para llamarlo c1.toString
    }
}
