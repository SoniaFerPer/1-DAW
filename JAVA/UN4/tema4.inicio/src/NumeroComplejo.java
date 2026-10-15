public class NumeroComplejo {
    double numeroReal;
    double numImaginario;

    String aCadena(){
        if(numImaginario == 0){
            return "" + numeroReal;
        }else if(numImaginario < 0){
            return numeroReal + " - " + (-numImaginario) + "i";
        }else {
            return numeroReal + " + " + numImaginario + "i";
        }

    }

    double calcularModulo(){
        return Math.sqrt(Math.pow(numeroReal,2) + Math.pow(numImaginario,2));
    }

    @Override
    public String toString() {
        return "NumeroComplejo{" +
                "numeroReal=" + numeroReal +
                ", numImaginario=" + numImaginario +
                '}';
    }
}
