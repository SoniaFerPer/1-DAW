public class Semaforo {
    private Estado rojo;
    private Estado ambar;
    private Estado verde;
    private boolean averiado;
    private int contadorSeniales;

    public Semaforo() {
        contadorSeniales = 0;
        averiado = false;
    }

    //GET SOLO LECTURA LUCES
    public Estado getRojo(){ return rojo;}
    public Estado getAmbar(){ return ambar;}
    public Estado getVerde(){ return verde;}

    //GETTER / SET AVERIA
    public boolean isAveriado() {
        return averiado;
    }

    public void setAveriado(boolean averiado) {
        this.averiado = averiado;
        patronLuces();
    }

    public void darSenyal(){
        if(averiado) {
            return;
        }
        contadorSeniales++;

        if(contadorSeniales>=12 + 1 + 22){
            contadorSeniales =0;
        }
        patronLuces();
    }

    public void forzarApertura(){
        contadorSeniales = 0;
        patronLuces();
    }

    public void patronLuces(){
    if(averiado){
        rojo = Estado.APAGADO;
        verde = Estado.ENCENDIDO;
        ambar = Estado.INTERMITENTE;
    }if(contadorSeniales ==0 && contadorSeniales ==12){

        }
    }



    public void dibujarSemaforo(){
        System.out.println("+---+");
        if (getRojo() == Estado.APAGADO) {
            System.out.print("""
                    | X |
                    |   |
                    | O |
                    |   |
                    | O |
                    """);
        }if(getAmbar() == Estado.INTERMITENTE){
            System.out.print("""
                    | O |
                    |   |
                    | * |
                    |   |
                    | O |
                    """);
        }if(getVerde() == Estado.ENCENDIDO){
            System.out.print("""
                    | O |
                    |   |
                    | 0 |
                    |   |
                    | x |
                    """);
        }
        System.out.println("+---+");
    }
}
