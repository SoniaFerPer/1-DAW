import java.util.Scanner;

public class ejer5 {
    public static void main (String[] args) {
        int decenas, unidades, centenas, num;
        boolean terminar=false;
        String centLetra = "", deLetra = "", uniLetra = "", numEsLetra = "";
        Scanner sc = new Scanner(System.in);

        while(!terminar) {


            System.out.print("Dime un numero: ");
            num = sc.nextInt();

            //LIMPIAR BUFFER
            sc.nextLine();

            unidades = num % 10;
            decenas = (num / 10) % 10;
            centenas = num / 100;

            if (num > 999) {
                throw new ArithmeticException("Número fuera de rango.");
            }
            if (num <= 0) {
                System.out.println("FIN");
                terminar = true;
            }

            //CENTENAS
            switch (centenas) {
                case 1:
                    centLetra = (decenas == 0 && unidades == 0) ? "cien" : "ciento";
                    break;
                case 2:
                    centLetra = "doscientos";
                    break;
                case 3:
                    centLetra = "trescientos";
                    break;
                case 4:
                    centLetra = "cuatrocientos";
                    break;
                case 5:
                    centLetra = "quinientos";
                    break;
                case 6:
                    centLetra = "seiscientos";
                    break;
                case 7:
                    centLetra = "setecientos";
                    break;
                case 8:
                    centLetra = "ochocientos";
                    break;
                case 9:
                    centLetra = "novecientos";
                    break;
            }

            //NUMEROS DEL 10 -19
            if (decenas == 1) {
                switch (unidades) {
                    case 0:
                        numEsLetra = "diez";
                        break;
                    case 1:
                        numEsLetra = "once";
                        break;
                    case 2:
                        numEsLetra = "doce";
                        break;
                    case 3:
                        numEsLetra = "trece";
                        break;
                    case 4:
                        numEsLetra = "catorce";
                        break;
                    case 5:
                        numEsLetra = "quince";
                        break;
                    case 6:
                        numEsLetra = "dieciséis";
                        break;
                    case 7:
                        numEsLetra = "diecisiete";
                        break;
                    case 8:
                        numEsLetra = "dieciocho";
                        break;
                    case 9:
                        numEsLetra = "diecinueve";
                        break;
                }

            }
            //UNIDADES 1-9
            if (decenas != 1) {
                switch (unidades) {
                    case 1:
                        uniLetra = "uno";
                        break;
                    case 2:
                        uniLetra = "dos";
                        break;
                    case 3:
                        uniLetra = "tres";
                        break;
                    case 4:
                        uniLetra = "cuatro";
                        break;
                    case 5:
                        uniLetra = "cinco";
                        break;
                    case 6:
                        uniLetra = "seis";
                        break;
                    case 7:
                        uniLetra = "siete";
                        break;
                    case 8:
                        uniLetra = "ocho";
                        break;
                    case 9:
                        uniLetra = "nueve";
                        break;
                }
            }

            // DECENAS
            switch (decenas) {
                case 2:
                    deLetra = (unidades == 0) ? "veinte" : "veinte y";
                    break;
                case 3:
                    deLetra = (unidades == 0) ? "treinta" : "treinta y";
                    break;
                case 4:
                    deLetra = (unidades == 0) ? "cuarenta" : "cuarenta y";
                    break;
                case 5:
                    deLetra = (unidades == 0) ? "cincuenta" : "cincuenta y";
                    break;
                case 6:
                    deLetra = (unidades == 0) ? "sesenta" : "sesenta y";
                    break;
                case 7:
                    deLetra = (unidades == 0) ? "setenta" : "setenta y";
                    break;
                case 8:
                    deLetra = (unidades == 0) ? "ochenta" : "ochenta y";
                    break;
                case 9:
                    deLetra = (unidades == 0) ? "noventa" : "noventa y";
                    break;
            }


            String resultado = "";

            //CENTENAS
            if (centenas > 0) {
                resultado += centLetra;
                if (decenas > 0 || unidades > 0) {
                    resultado += " ";
                }
            }

            // DECENAS Y UNIDADES
            if (decenas == 1) {
                // 10–19
                resultado += numEsLetra;
            } else if (decenas == 2 && unidades > 0) {
                // 21–29
                resultado += deLetra + uniLetra;
            } else if (decenas >= 3) {
                // 30–99
                resultado += deLetra;
                if (unidades > 0) {
                    resultado += " " + uniLetra;
                }
            } else if (decenas == 2 && unidades == 0) {
                // 20
                resultado += deLetra;
            } else if (decenas == 0) {
                // solo unidades
                resultado += uniLetra;
            }
            //con trim quitamos espacios al principio o al final
            System.out.println(resultado.trim());

        }
        sc.close();
    }
}
