package starWars;

public class PrincipalFlotaGalactica {
    public static void main(String[] args) {

        NaveEspacial[] flota = {

        new NaveCarga("Carguero-1", 10, 1000),

        new NaveCombate("Destructor", 50, 500),

        new NaveExploracion("Explorador-X", 8, 150),

        new CazaEstelar("Caza-Rojo", 2, 300, 9000)
        };

        for (NaveEspacial nave : flota) {
            //ACTIVAR DEFENSA DE TODAS
            nave.activarSistemaDefensa();

            //NAVE CARGA
            if (nave instanceof NaveCarga) {
                NaveCarga carga = (NaveCarga) nave;
                try {
                    carga.cargar(800);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }  //el uso de la excepcion que hemos dado si intentamos cargar x peso y si no se puede, que capture el mensaje descrito en el metodo
            }

            //COMBATE - DISPARAR
            if (nave instanceof NaveCombate) {
                NaveCombate combate = (NaveCombate) nave;
                combate.disparar();
            //CAZA - HIPERIMPULSO
                if (nave instanceof CazaEstelar) {
                    CazaEstelar caza = (CazaEstelar) nave;
                    caza.activarHiperimpulso();
                }
            }

            //EXPLORACION - EXPLORAR
            if (nave instanceof NaveExploracion) {
                NaveExploracion exploracion = (NaveExploracion) nave;
                boolean exito = exploracion.explorar();
                System.out.println("Exploración exitosa: " + exito);
            }
            System.out.println("..........................");
        }
    }
}
//tuve que preguntar a chatgpt lo del casting de Nave x y que me lo explicara porque me da error
//si no se me olvida me gustaria que lo explicaras en clase cuando volvamos :)