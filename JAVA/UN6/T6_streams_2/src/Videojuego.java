public class Videojuego {
        private String titulo;
        private String genero;
        private double precio;
        private int anoLanzamiento;
        private double puntuacion; // Sobre 10

        public Videojuego(String titulo, String genero, double precio, int anoLanzamiento, double puntuacion) {
            this.titulo = titulo;
            this.genero = genero;
            this.precio = precio;
            this.anoLanzamiento = anoLanzamiento;
            this.puntuacion = puntuacion;
        }

        public String getTitulo() { return titulo; }
        public String getGenero() { return genero; }
        public double getPrecio() { return precio; }
        public int getAnoLanzamiento() { return anoLanzamiento; }
        public double getPuntuacion() { return puntuacion; }

        @Override
        public String toString() {
            return titulo + " (" + anoLanzamiento + ") - " + genero + " - " + precio + "€ [" + puntuacion + "/10]";
        }
}
