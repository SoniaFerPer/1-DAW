package baseDeDatos;

import java.util.ArrayList;

public class ObraAudiovisual  implements Puntuable, TieneValoracion {
    private String titulo;
    private ArrayList<Integer> puntuaciones;

    public ObraAudiovisual(String titulo) {
        this.titulo = titulo;
        this.puntuaciones = new ArrayList<>();
    }

    public String getTitulo() { return titulo;}

    @Override
    public void asignarPuntuacion(int puntuacion) {

        if (puntuacion < 0 || puntuacion > 5) {
            throw new IllegalArgumentException("La puntuación debe estar entre 0 y 5");
        }
        puntuaciones.add(puntuacion);
    }

    @Override
    public double obtenerValoracion() {
        if (puntuaciones.isEmpty()) {
            return 0.0;
        }
        int suma = 0;

        for (int p : puntuaciones) {
            suma += p;
        }
        return (double) suma / puntuaciones.size();
    }
}
