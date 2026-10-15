import java.sql.*;

public class Main {
    private static final String url = "jdbc:mysql://localhost:33060/prueba";
    private static final String user = "root";
    private static final String password = "admin";

    public static void main(String[] args) {
        String sql = "SELECT * FROM vehiculo ORDER BY marca";


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
                                rs.getString("matricula") + ": " +
                                rs.getString("marca") + " " +
                                rs.getString("modelo") + " " +
                                rs.getInt("puertas") + " puertas");
            }
        }catch (SQLException e){
            System.err.println("Error al conectar: " + e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
        }

    }

}