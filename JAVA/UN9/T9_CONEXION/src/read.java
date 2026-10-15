import java.sql.*;

public class read {
    private static final String url = "jdbc:mysql://localhost:33060/prueba";
    private static final String user = "root";
    private static final String password = "admin";


    public static void main(String[] args) {
        String sql = "SELECT * FROM cliente ORDER BY id";


        try(Connection conn = DriverManager.getConnection(url,user,password);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery()){
            //SI FALLA LA CONEXION
            if (conn == null) {
                System.out.println("¡Conexión NO establecida!");
            }
            //LISTAR VEHICULOS
            System.out.println("LISTADO DE VEHÍCULOS");
            while (rs.next()) {
                System.out.println(
                        "- " +
                                rs.getString("id") + ": " +
                                rs.getString("nombre") + " " +
                                rs.getString("apellidos") + " " +
                                rs.getString("dni") + " ");
            }
        }catch (SQLException e){
            System.err.println("Error al conectar: " + e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
        }
    }
}


