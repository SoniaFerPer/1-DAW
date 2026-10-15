import banko.Cuenta;

public class Main {
    public static void main(String[] args) throws Exception {
        Cuenta ccc = new Cuenta("1234567890",-100);
        System.out.println(ccc.getSaldo());
        System.out.println(ccc.getNumero());
        //c)El saldo es cero porque hay una excepcion de si el saldo es negativo se ponga a 0 el saldo.
        //b)no es posible cambiar el numero porque es una constante
        //e)si ya que tenemos un constructor donde solo tenemos que especificar el numero
        System.out.println(ccc.getApertura());
        //no podemos cambiar la fecha de apertura porque esta declarada como constante
        System.out.println(ccc.isActiva());
        //g)es activa
        System.out.println(ccc.toString());
        ccc.ingreso(100);
        ccc.ingreso(50);
        ccc.reintegro(75.00);//porque hay que importar el throw
        System.out.println(ccc.getSaldo());
        ccc.setActiva(false);
        System.out.println(ccc.isActiva());
        //ccc.reintegro(100.00);
        //error cuenta bloqueada, al estar bloqueada salta esa excepcion, si no estuviera bloqueda saltaria error de saldo insuficiente
        ccc.setActiva(true);
        System.out.println(ccc.isActiva());
        //ccc.reintegro(100.00);
        //error saldo insuficiente

//        Cuenta ddd = new Cuenta("09876543211",200);
        //¡Error!:El número de cuenta no tiene el formato adecuado.tiene un numero mas
        Cuenta ddd = new Cuenta("0987654321",200);
        ccc.traspaso(ddd,25);
        System.out.println(ccc.toString());
        System.out.println(ddd.toString()); //en tostring hay un error donde no especificia en nombre del objeto sino que llama sea cual sea el objeto ccc

    }

}