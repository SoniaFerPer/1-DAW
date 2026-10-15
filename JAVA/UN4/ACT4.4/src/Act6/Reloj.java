package Act6;

public class Reloj {
    private int horas;
    private int minutos;
    private int segundos;

    public Reloj(int horas, int minutos, int segundos) {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    public void setHoras(int horas) {
        this.horas = horas >= 0 && horas <= 23 ? horas : 0;
    }
    public void setMinutos(int minutos) {
        this.minutos = minutos >= 0 && minutos <= 59 ? minutos : 0;
    }
    public void setSegundos(int segundos) {
        this.segundos = segundos >= 0 && segundos <= 59 ? segundos : 0;
    }


    public void tic(){
        this.setSegundos(this.getSegundos() + 1);
        if(getSegundos() == 60){
            this.setSegundos(0);
            this.setMinutos(this.getMinutos() + 1);
            if(getMinutos() == 60){
                this.setMinutos(0);
                this.setHoras(this.getHoras() + 1);
                if(getHoras() == 24){
                    this.setHoras(0);
                }
            }
        }
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", getHoras(), getMinutos(), getSegundos());  //para que la hora salga doble

    }

}
