package Act12;

public class Domino {
    private int ladoA;
    private int ladoB;

    public Domino(int ladoA, int ladoB) {
        if (ladoA < 0 || ladoA > 6 || ladoB < 0 || ladoB > 6) {
            throw new IllegalArgumentException("Los números de la ficha deben estar entre 0 y 6.");
        }
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }
    public int getLadoA() { return ladoA; }
    public int getLadoB() { return ladoB; }

    public int getPuntos() {
        return this.ladoA + this.ladoB;
    }

    public boolean esDoble() {
        return this.ladoA == this.ladoB;
    }

    public boolean conectaCon(Domino otra) {
        // Dos fichas conectan si cualquiera de sus lados coincide
        return this.ladoA == otra.ladoA || this.ladoA == otra.ladoB ||
                this.ladoB == otra.ladoA || this.ladoB == otra.ladoB;
    }

    public void dibujar() {
        String[][] plantillas = {
                {"     ","     ","     "},
                {"     ","  *  ","     "},
                {"*    ","     ","    *"},
                {"*    ","  *  ","    *"},
                {"*   *","     ","*   *"},
                {"*   *","  *  ","*   *"},
                {"* * *","     ","* * *"},
        };
        String[] izquierda1 = plantillas[izquierda];
        String[] izquierda1 = plantillas[izquierda];

    }

}