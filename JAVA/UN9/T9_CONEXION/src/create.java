import java.sql.*;

public class create {
    private static final String url = "jdbc:mysql://localhost:33060/prueba";
    private static final String user = "root";
    private static final String password = "admin";

    public static void main(String[] args) {
        String sql = "INSERT INTO cliente (nombre, apellidos, dni) VALUES (?, ?, ?)";


        try(Connection conn = DriverManager.getConnection(url,user,password);
            PreparedStatement pstmt = conn.prepareStatement(sql)){

            //AQUI PONEMOS LOS VALORES QUE QUEREMOS INTRODUCIR
            pstmt.setString(1, "Luis Ramon");
            pstmt.setString(2, "Lopez Lopez");
            pstmt.setString(3, "99887766E");

            int filasAfectadas = pstmt.executeUpdate();

            System.out.println("Cliente insertado con éxito" +
                    ". Filas afectadas: " + filasAfectadas);
        }catch (SQLException e){
            System.err.println("Error al conectar: " + e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
        }
    }
}