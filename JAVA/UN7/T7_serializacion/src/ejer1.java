import java.io. *;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del alumno: ");
        String nombre = sc.nextLine();

        String archivo = "dir\\" + nombre + ".dat";

        List<Double> calificaciones = new ArrayList<>();

        // Intentar leer archivo existente
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            calificaciones = (List<Double>) ois.readObject();
            //leer calificaciones ya existentes
            System.out.println("Calificaciones existentes:");
            for (double c : calificaciones) {
                System.out.println(c);
            }

        } catch (FileNotFoundException e) {
            System.out.println("No existe archivo. Se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el archivo.");
        }

        // Pedir nuevas calificaciones
        System.out.println("Introduce calificaciones (negativo para terminar):");

        while (true) {
            double nota = sc.nextDouble();
            if (nota < 0) break;

            calificaciones.add(nota);
        }

        // Guardar colección
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(calificaciones);
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar la colección.");
        }

        sc.close();
    }
}
