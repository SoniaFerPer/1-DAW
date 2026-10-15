package baseDeDatos;

import java.util.ArrayList;

public class ColeccionAudiovisual implements TieneValoracion {
    private String nombre;
    private ArrayList<ObraAudiovisual> obras;

    public ColeccionAudiovisual(String nombre) {

        this.nombre = nombre;
        this.obras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public double obtenerValoracion() {

        if (obras.isEmpty()) {
            return 0.0;
        }

        double suma = 0;

        for (ObraAudiovisual o : obras) {
            suma += o.obtenerValoracion();
        }

        return suma / obras.size();
    }
}
