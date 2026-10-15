public class multiplos3Y7 {
    public static void main(String[] args) {
        System.out.println("multiplos de 3 y 7: ");
        for (int i = 10;  i<= 1000 ; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.print(i + " - ");
            }
        }

   }
}
