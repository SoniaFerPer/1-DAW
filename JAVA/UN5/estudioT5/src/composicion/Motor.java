package composicion;

public class Motor {
    private String tipo;
    private String potencia;

    public Motor(String tipo, String potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPotencia() {
        return potencia;
    }
}
