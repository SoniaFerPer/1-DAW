package limitadorVelocidad;

public class Vehiculo {
    private String matricula;
    private int velocidad;
    private boolean isActivo;
    static int LIMITE_VELOCIDAD = 120;

    public Vehiculo(String matricula) {
        this.setMatricula(matricula);
        this.setActivo(false);
        if(velocidad >= 0){
            this.setVelocidad(0);
        }else{
            throw new IllegalArgumentException("La velocidad no puede ser menor que 0.");
        }
    }

    public Vehiculo(String matricula, boolean isActivo) {
        this.setMatricula(matricula);
        this.setActivo(true);
        this.setVelocidad(0);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if(matricula.matches("//d{4}[A-Za-z]{3}")){
            this.matricula = matricula;
        }else{
            throw new RuntimeException("la matricula tiene que tener 4 digitos y 3 letras.");
        }

    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isActivo() {
        return isActivo;
    }

    public void setActivo(boolean activo) {
        isActivo = activo;
    }

    public void activarLimitador(){
        this.isActivo = true;
    }
    public void desactivarLimitador(){
        this.isActivo = false;
    }
    public int getVelocidadActual(){
        return velocidad;
    }
    public int acelerar(int incremento){
        if(this.isActivo = true && velocidad + incremento <= LIMITE_VELOCIDAD){
            return velocidad += incremento;
        }else{
            throw new IllegalArgumentException("No puede tener mas de 120km.");
        }
    }
    public int frenar(int decremento){
        if(velocidad > 0){
            return velocidad -= decremento;
        }if(velocidad - decremento <0){
            return velocidad = 0;
        }else{
            throw new IllegalArgumentException("No puede tener menos de 0 km.");
        }
    }

    public static void setLimiteVelocidad(int nuevoLimite){
        LIMITE_VELOCIDAD = nuevoLimite;
    }


}
