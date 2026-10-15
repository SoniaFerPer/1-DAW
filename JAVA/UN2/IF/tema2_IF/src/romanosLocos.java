import java.util.Scanner;

public class romanosLocos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,unidades,decenas;

        System.out.println("Escriba un numero del 0 al 99: ");
        num=sc.nextInt();

        if((num<0) || (num>99)){
            System.out.print("El número no es válido.");
        }else if (num == 0) {
            System.out.println("No existe el 0 en números romanos.");
        }else {
            decenas = num / 10;
            if (decenas == 1) {
                System.out.print("X");
            } else if (decenas == 2) {
                System.out.print("XX");
            } else if (decenas == 3) {
                System.out.print("XXX");
            } else if (decenas == 4) {
                System.out.print("XL");
            } else if (decenas == 5) {
                System.out.print("L");
            } else if (decenas == 6) {
                System.out.print("LX");
            } else if (decenas == 7) {
                System.out.print("LXX");
            } else if (decenas == 8) {
                System.out.print("LXXX");
            } else if (decenas == 9) {
                System.out.print("XC");
            }
        }
        unidades = num % 10;
            if (unidades == 1) {
                System.out.print("I");
            } else if (unidades == 2) {
                System.out.print("II");
            } else if (unidades == 3) {
                System.out.print("III");
            } else if (unidades == 4) {
                System.out.print("IV");
            } else if (unidades == 5) {
                System.out.print("V");
            } else if (unidades == 6) {
                System.out.print("VI");
            } else if (unidades == 7) {
                System.out.print("VII");
            } else if (unidades == 8) {
                System.out.print("VIII");
            } else if (unidades == 9) {
                System.out.print("IX");
            }
    }
}
