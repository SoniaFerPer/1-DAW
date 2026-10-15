package ejer2;

public class LineaPedido {
    private int tipoIVA;
    private double precioUndidad;
    private int unidades;
    private String concepto;

    public LineaPedido(String concepto, double precioUndidad, int unidades, int tipoIVA) {
        this.concepto = concepto;
        this.precioUndidad = precioUndidad;
        this.unidades = unidades;
        this.tipoIVA = tipoIVA;
    }



    public double getPrecioUndidad() {
        return precioUndidad;
    }
    public double getPrecioTotalBruto(){
        return getPrecioTotalNeto() * (1 + (double) tipoIVA / 100.0); //lo casteamos a double xk el IVA es int y el resto es double
    }

    public double getPrecioTotalNeto(){
        return precioUndidad * unidades;

    }

    public String getConcepto() {
        return concepto;
    }
    public int getUnidades() {
        return unidades;
    }
    public int getTipoIVA() {
        return tipoIVA;
    }

    @Override
    public String toString() {
        return "LineaPedido{" +
                "tipoIVA=" + tipoIVA +
                ", precioUndidad=" + precioUndidad +
                ", unidades=" + unidades +
                ", concepto='" + concepto + '\'' +
                '}';
    }
}
