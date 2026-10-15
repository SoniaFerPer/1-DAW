package termometro;

public enum Temperatura {
    FRIO,TEMPLADO,CALIENTE;

    public boolean esAdecuada(double temperatura) {
        switch (this) {
            case FRIO:
                return temperatura < 10;
            case TEMPLADO:
                return temperatura >= 10 && temperatura <= 25;
            case CALIENTE:
                return temperatura > 25;
            default:
                return false;
        }
    }

}
