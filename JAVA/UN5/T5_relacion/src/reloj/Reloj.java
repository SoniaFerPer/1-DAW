package reloj;

public class Reloj{

    private final int hora;
    private final int minutos;
    private final int segundos;

    public Reloj() {
        this(0, 0, 0);
    }

    public Reloj(int hora) {
        this(hora, 0, 0);
    }

    public Reloj(int hora, int minutos) {
        this(hora, minutos, 0);
    }

    public Reloj(int hora, int minutos, int segundos) {
        if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) {
            throw new IllegalArgumentException("Hora inválida");
        }
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHora() { return hora;}

    public int getMinutos() { return minutos;}

    public int getSegundos() { return segundos;}

    public Reloj incrementaSegundos() { return incrementaSegundos(1);
    }

    public Reloj incrementaSegundos(int s) {
        int total = hora * 3600 + minutos * 60 + segundos;
        total += s;
        total = ((total % 86400) + 86400) % 86400;
        int h = total / 3600;
        int m = (total % 3600) / 60;
        int sec = total % 60;

        return new Reloj(h, m, sec);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minutos, segundos);
    }
}
