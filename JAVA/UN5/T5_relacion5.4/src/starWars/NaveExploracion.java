package starWars;

public class NaveExploracion extends NaveEspacial {
    double rango;

    public NaveExploracion(String nombre, int tripulacion, double rango) {
        super(nombre, tripulacion);
        this.rango = rango;
    }

    public boolean explorar(){
        System.out.println(nombre + " explora un radio de " + rango + " años luz.");
        if(rango > 100){
           return true;
        }else{
            return false;
        }
    }

}
