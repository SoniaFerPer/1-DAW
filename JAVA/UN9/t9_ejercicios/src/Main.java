import java.sql.*;

public class Main {
    private static final String user = "root";
    private static final String password = "admin";
    private static final String url = "jdbc:mysql://localhost:33060/tinder_laboral";

    public static void main(String[] args) {
        //CONEXION
        Connection conn = conectar(url);
        //1. EJERCICIO
        listarCandidatos(conn);

    }
    public static Connection conectar (String url){
        try{
            Connection conn = DriverManager.getConnection(url,user,password);
            return conn;

        }catch (SQLException e){
            System.err.println("Error al conectar: " +   e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
            return null;
        }
    }

    public static void listarCandidatos(Connection conn){
        String sql = "SELECT * FROM candidato WHERE perfil_tech = 'Frontend' ORDER BY nombre";

        try(PreparedStatement psmt = conn.prepareStatement(sql);
            ResultSet rs = psmt.executeQuery()){
            System.out.println("LISTADO DE CANDIDATOS");
            while(rs.next()){
                System.out.println(
                        "- " +
                                rs.getInt("id") + ": " +
                                rs.getString("nombre") + " " +
                                rs.getString("email") + " " +
                                rs.getString("perfil_tech") + " " +
                                rs.getInt("experiencia_anios") + " " +
                                rs.getInt("salario_esperado") + "€");
            }

        }catch (SQLException e){
            System.err.println("Error al conectar: " +   e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
        }
    }
}