package tareas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListaTareas {

    public void listarTareasPendientes(){
        String sql="SELECT t.id, t.titulo, t.descripcion, t.prioridad, c.nombre AS categoria " +
                "FROM tarea t LEFT JOIN categoria c ON t.categoria_id = c.id " +
                "WHERE t.completada = 0 " +
                "ORDER BY t.prioridad ASC";
        try (Connection conn = Conexion.conectar();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            boolean hayTareas = false;

            while (rs.next()) {
                hayTareas = true;
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("titulo: " + rs.getString("titulo"));
                System.out.println("Descripcion: " + rs.getString("descripcion"));
                System.out.println("Prioridad: " + rs.getInt("prioridad"));

            }
            if(!hayTareas) System.out.println("No hay tareas pendientes");

        }catch (SQLException e){
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void marcarTareasCompletadas(int id){
        String sql = "UPDATE tarea SET completada = 1 WHERE id = ?";

        try (Connection conn = Conexion.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            int filas = ps.executeUpdate();
            if (filas > 0) System.out.println("¡Tarea marcada como completada!");
            else System.out.println("No se encontró ninguna tarea con ese ID.");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void crearNuevaTarea(String titulo,String desc,int prio,int catId){
        String sql= "INSERT INTO tarea(titulo, descripcion, prioridad, categoria_id) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexion.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, titulo);
            ps.setString(2, desc);
            ps.setInt(3, prio);
            ps.setInt(4, catId);
            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println("Error al crear: " + e.getMessage());
        }
    }
    public void registrarNuevaCategoria(String nombre){
        String sql= "INSERT INTO categoria(nombre) VALUES (?)";

        try (Connection conn = Conexion.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println("Error al crear: " + e.getMessage());
        }
    }

    public void eliminarCategoria(int id){
        String sql= "DELETE FROM categoria WHERE id= ?";

        try (Connection conn = Conexion.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println("Error al crear: " + e.getMessage());
        }
    }

    public void recuperarTareaCompletada(int id){
        String sql= "UPDATE tarea SET completada = 0 WHERE id = ?";

        try (Connection conn = Conexion.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();

        }catch (SQLException e){
            System.out.println("Error al crear: " + e.getMessage());
        }


    }
}
