import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        String archivo = "dir\\llamadas.dat";

        do{
            System.out.println("""
                Marque la opcion deseada:
                1. listas numeros
                2.añadir contacto
                3.salir""");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                    listarTelefonos(archivo);
                    break;
                case 2:
                    System.out.println("marque el numero telefónico:");
                    String numero = sc.nextLine();
                    añadirNumero(archivo,numero);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }

        }while(opcion != 3);
    }
    public static Set<String> leerArchivo(String archivo) {

        Set<String> telefonos = new HashSet<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            telefonos = (Set<String>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("No existe archivo. Se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el archivo.");
        }

        return telefonos;
    }
    public static void listarTelefonos (String archivo){
        Set<String> telefonos = leerArchivo(archivo);
            if (telefonos.isEmpty()) {
                System.out.println("No hay numeros guardados.");
            }
            for(String c : telefonos){
                System.out.println(c);
            }
    }
    public static void añadirNumero(String archivo,String numero){
        Set<String> telefonos = leerArchivo(archivo);
        telefonos.add(numero);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(telefonos);
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar la coleccion.");
        }
    }
}
