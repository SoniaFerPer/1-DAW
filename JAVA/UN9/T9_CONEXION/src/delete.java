import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delete {
    private static final String url = "jdbc:mysql://localhost:33060/prueba";
    private static final String user = "root";
    private static final String password = "admin";

    public static void main(String[] args) {
        String sql = "DELETE FROM cliente WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(url,user,password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, 5);
            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Cliente eliminado correctamente");
            // Gracias a ON DELETE SET NULL, sus vehículos ahora
            // aparecerán como no asignados
            } else {
                System.out.println("El cliente con ese ID no existe");
            }
        } catch (SQLException e) {
            System.err.println("Error al eliminar el cliente: " +
                    e.getMessage());
        }
    }
}
