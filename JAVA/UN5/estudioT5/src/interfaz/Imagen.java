package interfaz;

public class Imagen implements Guardable {
    @Override
    public void guardar(){
        System.out.println("guardando documento");

    }
    @Override
    public void cargar(){
        System.out.println("cargando documento");
    }
}
