package planetas;

import java.lang.management.PlatformLoggingMXBean;

public class Main {
    public static void main(String[] args) {
        PlanetaSistemaSolar tierra = PlanetaSistemaSolar.TIERRA;

        System.out.println("Planeta: " + tierra);
        System.out.println("Masa: " + tierra.getMasa() + " kg");
        System.out.println("Radio: " + tierra.getRadio() + " m");
        System.out.println("Gravedad: " + tierra.getGravedad() + " m/s²");

    }

}