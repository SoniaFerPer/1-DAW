package polimorfismo;

public class Perro extends Animal{
    @Override
    public void emitirSonido(){
        System.out.println("Perro ladra");
    }
}
