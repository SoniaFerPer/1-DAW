public class PrincipalComplejo {

    public static void main(String [] args){
        NumeroComplejo c1 = new NumeroComplejo();
        c1.numeroReal = 3;
        c1.numImaginario = 4;

        System.out.println(c1.aCadena() + " -> modulo: " + c1.calcularModulo());

        NumeroComplejo c2 = new NumeroComplejo();
        c2.numeroReal = 6;
        c2.numImaginario = -8;

        System.out.println(c2.aCadena() + " -> modulo: " + c2.calcularModulo());
    }
}

