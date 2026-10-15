package barajas;

public enum PaloIngles {
    CORAZON,DIAMANTE,TREBOL,PICA;

    public boolean esRojo(){
        if (this == CORAZON) {
            return true;
        }
        if (this == DIAMANTE) {
            return true;
        }
        return false;
    }

    public boolean esNegro(){
        if (this == PICA) {
            return true;
        }
        if (this == TREBOL) {
            return true;
        }
        return false;
    }

    public char getSimbolo(){
        if (this == DIAMANTE) {
            return '♦';
        }
        if (this == CORAZON) {
            return '♥';
        }
        if (this == PICA) {
            return '♠';
        }
        if (this == TREBOL) {
            return '♣';
        }
        return '?';
    }




}
