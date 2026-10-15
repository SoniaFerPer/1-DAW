import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update {
    private static final String url = "jdbc:mysql://localhost:33060/prueba";
    private static final String user = "root";
    private static final String password = "admin";

    public static void main(String[] args) {
        //ACTUALIZAMOS EL ID DEL CLIENTE DONDE UNA MATRICULA ES TAL
        String sql = "UPDATE vehiculo SET cliente_id = ? " + "WHERE matricula = ?";

        try(Connection conn = DriverManager.getConnection(url,user,password);
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            //CAMBIAMOS LOS DATOS
            int idCliente = 6;
            String matricula = "9900 MRZ";

            //LA MATRICULA DEBE EXISTIR
            pstmt.setString(2,matricula);
            //EL ID DEL CLIENTE DEBE EXISTIR Y ACTUALIZAMOS EL CLIENTE AL QUE PERTENECE EL COCHE
            pstmt.setInt(1, idCliente);

            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Vehículo " + matricula +
                        " asignado al cliente ID " + idCliente +
                        " correctamente.");
            } else {
                System.out.println("No se encontró ningún vehículo " +
                        "con esa matrícula.");
            }
        }catch (SQLException e){
            System.err.println("Error al actualizar el vehiculo: " + e.getMessage());
        }
    }
}
