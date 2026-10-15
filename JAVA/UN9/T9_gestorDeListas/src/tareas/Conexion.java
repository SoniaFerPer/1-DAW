package tareas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String url = "jdbc:mysql://localhost:33060/gestor_tareas";
    private static final String password = "admin";
    private static final String admin = "root";

    public static Connection conectar(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url,admin,password);

        }catch (SQLException e){
            System.out.println("Error de conexión: " + e.getMessage());
        }
        return conn;
    }
}
