package Act4;

public class MainPlaneta {
    public static void main(String[] args) {
        Planeta p1=new Planeta("Marte",6779,227940000);
        Planeta p2=new Planeta("Venus",	12104,108200000);
        Planeta p3=new Planeta("Plutón",2376,5906400000L); //para numeros muy largo se añade L al final del numero para indicarle que ese numero debe ser tratado como un long
        Planeta p4=new Planeta("Júpiter",139820,778000000);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}