import java.io.*;
import java.security.PublicKey;
import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {

            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion){

                case 1:
                    System.out.println("Dime el nombre:");
                    String nombre = sc.nextLine().trim();
                    System.out.println("Dime el telefono:");
                    String telefono = sc.nextLine().trim();
                    añadirContacto(nombre,telefono);
                    break;

                case 2:
                    listarContactos();
                    break;

                case 3:
                    System.out.println("Dime el nombre:");
                    String nombre1 = sc.nextLine().trim();
                    buscarContacto(nombre1);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while(opcion != 4);
    }
    public static void mostrarMenu(){
        System.out.println("""
                1.Añadir contacto
                2.Listas contactos
                3.Buscar contacto
                4.salir
                """);
    }

    //---METODO PARA AÑADIR CONTACTO---
    public static void añadirContacto(String nombre,String telefono){
        //PARA QUE NO TENGA DOBLE PUNTO
        if(nombre.contains(":") || telefono.contains(":")){
            System.out.println("No se permite ':' en nombre ni en teléfono");
            return;
        }
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("dir\\agenda.txt",true))){
            bw.write(nombre + ":" + telefono);
            bw.newLine(); //SALTO PARA QUE NO PONGA LOS CONTACTOS SEGUIDOS
        }catch (IOException e){
            System.err.println("fichero no encontrado.");
        }
    }

    //---lISTAR CONTACTOS---
    public static void listarContactos(){
        try(BufferedReader br = new BufferedReader(new FileReader("dir\\agenda.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null){
                String[] palabras = linea.split(":");
                System.out.println("Nombre: " + palabras[0]+ ", Telefono: " + palabras[1]);
            }
        System.out.println();
        }catch(IOException e){
        System.err.println("fichero no encontrado.");
        }
    }

    //---BUSCAR UN CONTACTO---
    public static void buscarContacto(String nombre){
        try(BufferedReader br = new BufferedReader(new FileReader("dir\\agenda.txt"))){
            String linea;
            boolean encontrado = false;

            while((linea = br.readLine()) != null){
                String[] buscarNumero = linea.split(":");

                if(buscarNumero.length == 2 && buscarNumero[0].equalsIgnoreCase(nombre)){
                    System.out.println("El número de " + buscarNumero[0] + " es: " + buscarNumero[1] + "\n");
                    encontrado = true;
                    break;
                }
            }
            if(!encontrado) System.out.println("El nombre no existe en la agenda.\n"); //TIENE QUE ESTAR FUERA PARA QUE NO SE IMPRIMA EN CADA LINEA DEL BUCLE

        }catch (IOException e){
            System.err.println("Error al leer el fichero.");
        }
    }

}
