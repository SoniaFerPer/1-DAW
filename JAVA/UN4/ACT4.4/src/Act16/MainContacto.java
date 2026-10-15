package Act16;

import java.util.Scanner;

public class MainContacto {
    private static Contacto[] agenda = new Contacto[20];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1 -> listarContactos();
                case 2 -> buscarContacto();
                case 3 -> eliminarContacto();
                case 4 -> añadirContacto();
                case 5 -> System.out.println("Saliendo de la agenda...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- AGENDA DE CONTACTOS ---");
        System.out.println("1. Listar contactos");
        System.out.println("2. Buscar contacto");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Añadir contacto");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
    }

    private static void añadirContacto() {
        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i] == null) {
                System.out.print("Nombre: "); String nom = sc.nextLine();
                System.out.print("Apellidos: "); String ape = sc.nextLine();
                System.out.print("Teléfono: "); String tel = sc.nextLine();
                agenda[i] = new Contacto(nom, ape, tel);
                System.out.println("Contacto añadido en posición " + i);
                return;
            }
        }
        System.out.println("Error: La agenda está llena.");
    }

    private static void listarContactos() {
        System.out.println("\n--- LISTADO ---");
        boolean vacia = true;
        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i] != null) {
                System.out.println(i + ". " + agenda[i]);
                vacia = false;
            }
        }
        if (vacia) System.out.println("Agenda vacía.");
    }

    private static void buscarContacto() {
        System.out.print("¿Buscar por (1) Posición o (2) Nombre?: ");
        int modo = Integer.parseInt(sc.nextLine());
        if (modo == 1) {
            System.out.print("Introduce posición (0-19): ");
            int pos = Integer.parseInt(sc.nextLine());
            if (pos >= 0 && pos < 20 && agenda[pos] != null) {
                System.out.println("Encontrado: " + agenda[pos]);
            } else System.out.println("Posición vacía o fuera de rango.");
        } else {
            System.out.print("Nombre a buscar: ");
            String nom = sc.nextLine();
            for (Contacto c : agenda) {
                if (c != null && c.getNombre().equalsIgnoreCase(nom)) {
                    System.out.println("Encontrado: " + c);
                    return;
                }
            }
            System.out.println("Contacto no encontrado.");
        }
    }

    private static void eliminarContacto() {
        System.out.print("¿Eliminar por (1) Posición o (2) Nombre?: ");
        int modo = Integer.parseInt(sc.nextLine());
        if (modo == 1) {
            System.out.print("Posición: ");
            int pos = Integer.parseInt(sc.nextLine());
            if (pos >= 0 && pos < 20) {
                agenda[pos] = null;
                System.out.println("Contacto eliminado.");
            }
        } else {
            System.out.print("Nombre: ");
            String nom = sc.nextLine();
            for (int i = 0; i < agenda.length; i++) {
                if (agenda[i] != null && agenda[i].getNombre().equalsIgnoreCase(nom)) {
                    agenda[i] = null;
                    System.out.println("Contacto '" + nom + "' eliminado.");
                    return;
                }
            }
        }
    }
}
