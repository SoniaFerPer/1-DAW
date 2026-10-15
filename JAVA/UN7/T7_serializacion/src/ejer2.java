import java.io.*;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> invitados = new TreeSet<>();

        //LEER EL SET SI EXISTE
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dir\\invitados.dat"))){
            invitados = (Set<String>) ois.readObject();
            //leer calificaciones ya existentes
            System.out.println("Calificaciones existentes:");
            for (String c : invitados) {
                System.out.println(c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No existe archivo. Se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el archivo.");
        }

        // Pedir nuevas calificaciones
        System.out.println("Introduce el nombre de los invitados (fin para terminar):");

        while (true) {
            String nombre = sc.nextLine();
            if (nombre.trim().equals("fin")) break;

            invitados.add(nombre);
        }

        // LOS METEMOS EN EL ARCHIVO
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dir\\invitados.dat"))) {
            oos.writeObject(invitados);
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar la coleccion.");
        }

        sc.close();
    }
}
