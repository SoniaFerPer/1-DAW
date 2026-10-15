package es.iesoretania.progr.ejercicios;

public class ConversorEuroDolar {
    static double CONVERSOR_EURO_DOLAR = 1.04;

    public static double eurosADolares(double euros){
        return euros * CONVERSOR_EURO_DOLAR;
    }

    public static double dolaresAEuros(double dolares){
        return dolares / CONVERSOR_EURO_DOLAR;
    }
    public static void setCotizacionDolarAEuro(double dolaresPorEuro){
        CONVERSOR_EURO_DOLAR = dolaresPorEuro;
    }
    public static void setCotizacionEuroADolar(double euroPorDolar){
        CONVERSOR_EURO_DOLAR = 1 / euroPorDolar;
    }

}
