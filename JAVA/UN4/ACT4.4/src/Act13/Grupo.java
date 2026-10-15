package Act13;

public class Grupo {
    private String nombreGrupo;
    private int numeroAula;
    private int planta;
    private Docente tutor; // llamamos al Atributo de tipo Docente
    private Estudiante[] alumnado; // para almacenar a los alumnos de tipo Estudiante

    public Grupo(String nombreGrupo, int numeroAula, int planta, Docente tutor) {
        this.nombreGrupo = nombreGrupo;
        this.numeroAula = numeroAula;
        this.planta = planta;
        this.tutor = tutor;
        this.alumnado = new Estudiante[38]; // para crear
    }

    public void añadirEstudiante(Estudiante nuevoEstudiante) {
        for (int i = 0; i < alumnado.length; i++) {
            if (alumnado[i] == null) {
                alumnado[i] = nuevoEstudiante;
                System.out.println("Añadido: " + nuevoEstudiante.getNombreCompleto());
                return;
            }
        }
        System.out.println("ERROR: El grupo está lleno (máx. 38 estudiantes).");
    }

    public int contarEstudiantes() {
        int contador = 0;
        for (Estudiante est : alumnado) {
            if (est != null) {
                contador++;
            }
        }
        return contador;
    }

    public Estudiante getEstudiantePorPosicion(int numero) {
        // Los arrays empiezan en 0, así que restamos 1 a la posición solicitada
        int indice = numero - 1;

        if (indice >= 0 && alumnado[indice] != null) {
            return alumnado[indice];
        } else {
            System.out.println("ERROR: Posición inválida o vacía.");
            return null; // Devuelve nulo si no se encuentra o el índice es incorrecto
        }
    }

    @Override
    public String toString() {
        return String.format("Grupo: %s | Aula: %d Planta: %d | Tutor: %s | Alumnos: %d/%d",
                nombreGrupo, numeroAula, planta, tutor.getNombreCompleto(),
                contarEstudiantes());
    }
}
