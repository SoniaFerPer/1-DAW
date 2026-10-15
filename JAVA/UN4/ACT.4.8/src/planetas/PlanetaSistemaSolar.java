package planetas;

public enum PlanetaSistemaSolar {
    MERCURIO(3.30e23, 2439.7),
    VENUS(4.87e24, 6051.8),
    TIERRA(5.97e24, 6371),
    MARTE(6.42e23, 3389.5),
    JUPITER(1.90e27, 69911),
    SATURNO(5.68e26, 58232),
    URANO(8.68e25, 25362),
    NEPTUNO(1.02e26, 24622);

    private double masa;
    private double radio;
    private static final double GRAVEDAD_SUPERFICIAL =6.67430e-11;

    PlanetaSistemaSolar(double masa, double radio) {
        this.masa = masa;
        this.radio = radio;
    }

    public double getMasa() {
        return masa * 1000;
    }

    public double getRadio() {
        return radio * 1000;
    }

    public double getGravedad(){
        return (GRAVEDAD_SUPERFICIAL * getMasa()) / Math.pow(getRadio(),2);
    }
}
