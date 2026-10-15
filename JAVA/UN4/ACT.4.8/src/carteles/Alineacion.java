package carteles;

public enum Alineacion {
    IZQUIERDA,CENTRO,DERECHA;

    public int espaciosIzquierda(int longitudCartel, int longitudTexto) {
        int espacios = longitudCartel - longitudTexto;

        if (this == IZQUIERDA) {
            return 0;
        }
        else if (this == DERECHA) {
            return espacios;
        }
        else { // CENTRO
            return espacios / 2;
        }
    }

}
