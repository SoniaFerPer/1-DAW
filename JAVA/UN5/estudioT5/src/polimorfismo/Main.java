package polimorfismo;

public class Main {
    public static void main(String[] args){
        Animal an = new Animal();
        Animal a1 = new Perro();
        Animal a2 = new Gato();

        an.emitirSonido();
        a1.emitirSonido();
        a2.emitirSonido();
    }
}
