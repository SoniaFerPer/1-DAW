
public class Main {
    public static void main(String[] args) {

        String cad= "abracadabra";

        System.out.println(cad.indexOf("cada"));

        String myStr = "Hello %s! One kilobyte is %,d bytes.";
        String result = String.format(myStr, "World", 1024);
        System.out.println(result);

    }
}
