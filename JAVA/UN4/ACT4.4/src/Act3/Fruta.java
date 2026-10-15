package Act3;

public class Fruta {
    private final String nombre;
    private String color;
    private double peso;

    public Fruta(String nombre, String color, double peso) {
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public double getPeso() {
        return peso;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String describir() {
        return "Fruta: " + this.nombre + " | Color: " + this.color + " | Peso: " + this.peso;
    }


}
