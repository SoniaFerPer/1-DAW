package tareas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaTareas tareas = new ListaTareas();

        int opcion;
        do{

            System.out.println("""
                    --- GESTOR DE TAREAS ---
                    1. Listar tareas pendientes
                    2. Marcar completada
                    3. Crear tarea
                    4. Registrar categoría
                    5. Eliminar categoría
                    6. Recuperar tarea
                    7. Salir
                    """);

            if(sc.hasNextInt()){
                opcion = sc.nextInt();
            }else {
                opcion  = 0;
            }

           sc.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("TAREAS PENDIENTES");
                    tareas.listarTareasPendientes();
                    System.out.println("------------------");
                    break;
                case 2:
                    System.out.print("Introduce el ID de la tarea completada: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    tareas.marcarTareasCompletadas(id);
                    System.out.println("------------------");
                    break;
                case 3:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Descripción: ");
                    String descripcion = sc.nextLine();
                    System.out.print("Prioridad (1-Alta, 2-Media, 3-Baja): ");
                    int prioridad = sc.nextInt();
                    sc.nextLine();
                    System.out.print("ID Categoría: ");
                    int cat_Id = sc.nextInt();
                    sc.nextLine();
                    tareas.crearNuevaTarea(titulo,descripcion,prioridad,cat_Id);
                    System.out.println("Tarea creada con éxito.");
                    System.out.println("------------------");
                    break;
                case 4:
                    System.out.println("Nombre nueva categoria");
                    String nombre = sc.nextLine();
                    tareas.registrarNuevaCategoria(nombre);
                    System.out.println("Categoria creada con exito");
                    System.out.println("------------------");
                    break;
                case 5:
                    System.out.print("ID de categoría a eliminar: ");
                    int idc = sc.nextInt();
                    sc.nextLine();
                    tareas.eliminarCategoria(idc);
                    System.out.println("Categoria eliminada con exito");
                    System.out.println("------------------");
                    break;
                case 6:
                    System.out.print("ID de la tarea a desmarcar: ");
                    int idR = sc.nextInt();
                    sc.nextLine();
                    tareas.recuperarTareaCompletada(idR);
                    System.out.println("Tarea recuperada con exito");
                    System.out.println("------------------");
                    break;
                case 7:
                     System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while (opcion != 7);

    }
}
