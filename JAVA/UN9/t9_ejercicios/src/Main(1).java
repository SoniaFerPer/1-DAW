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
        //2. EJERCICIO
        ofertasDisponibles(conn);
        //3. EJERCICIO
        insertarCandidato(conn,"Sandra Mejide", "sandra@email.com", "Backend", 2, 23000);
        //4. EJERCICIO
        subirSalario(conn,1);
        //5. EJERCICIO
        eliminarCandidato(conn,"cmartinez.web@email.com");
        //6. EJERCICIO
        contraofertaFullstack(conn);
        //7. EJERCICIO
        mostrarStartups(conn);
        //8. EJERCICIO
        aumentarExperiencia(conn,"");
        //9. EJERCICIO
        insertarOferta(conn, " "," ", " ", 22000,2);
        //10. EJERCICIO
        eliminarOfertasCerradas(conn);
        //11. EJERCICIO
        reabrirOferta(conn,3);
        //12. EJERCICIO
        matchingCandidatosOfertas(conn);

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

    //1 - listar candidatos con frondEnd
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
    // 2. Ofertas abiertas con salario
    public static void ofertasDisponibles(Connection conn) {
        String sql = "SELECT titulo, tecnologia_clave, salario_max " +
                "FROM oferta WHERE candidato_contratado_id IS NULL AND salario_max >= 24000";

        try (Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println("Título: " + rs.getString("titulo"));
                System.out.println("Tecnología: " + rs.getString("tecnologia_clave"));
                System.out.println("Salario: " + rs.getInt("salario_max"));
            }

        } catch (SQLException e) {
            System.err.println("Error al conectar: " +   e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
        }
    }
    // 3. Insertar candidato
    public static void insertarCandidato(Connection conn, String nombre, String email, String perfil, int exp, int salario) {
        String sql = "INSERT INTO candidato (nombre, email, perfil_tech, experiencia_anios, salario_esperado) " +
                "VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nombre);
            ps.setString(2, email);
            ps.setString(3, perfil);
            ps.setInt(4, exp);
            ps.setInt(5, salario);

            ps.executeUpdate();
            System.out.println("Candidato insertado correctamente");

        } catch (SQLException e) {
            System.err.println("Error al conectar: " +   e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
        }
    }

    // 4. Subir salario de una oferta +2000€
    public static void subirSalario(Connection conn, int idOferta) {
        String sql = "UPDATE oferta SET salario_max = salario_max + 2000 WHERE id = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idOferta);
            ps.executeUpdate();

            System.out.println("Salario actualizado");

        } catch (SQLException e) {
            System.err.println("Error al conectar: " +   e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
        }
    }

    // 5. Eliminar candidato por email
    public static void eliminarCandidato(Connection conn, String email) {
        String sql = "DELETE FROM candidato WHERE email = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, email);
            ps.executeUpdate();

            System.out.println("Candidato eliminado");

        } catch (SQLException e) {
            System.err.println("Error al conectar: " +   e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
        }
    }

    // 6. Contraoferta Appify
    public static void contraofertaFullstack(Connection conn) {
        String sql = "UPDATE oferta SET modalidad = 'Remoto', salario_max = salario_max + 5000 " +
                "WHERE titulo = 'Fullstack Web Developer'";

        try (Statement st = conn.createStatement()) {

            st.executeUpdate(sql);
            System.out.println("Contraoferta aplicada");

        } catch (SQLException e) {
            System.err.println("Error al conectar: " +   e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
        }
    }
    // 7. Mostrar startups
    public static void mostrarStartups(Connection conn) {
        String sql = "SELECT nombre, sede FROM empresa WHERE es_startup = 1 ORDER BY nombre";

        try (Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println("Empresa: " + rs.getString("nombre"));
                System.out.println("Sede: " + rs.getString("sede"));
                System.out.println("------------------------");
            }

        } catch (SQLException e) {
            System.err.println("Error al conectar: " +   e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
        }
    }

    // 8. Aumentar experiencia por email
    public static void aumentarExperiencia(Connection conn, String email) {
        String sql = "UPDATE candidato SET experiencia_anios = experiencia_anios + 1 WHERE email = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, email);
            int filas = ps.executeUpdate();

            if (filas > 0) {
                System.out.println("Experiencia actualizada");
            } else {
                System.out.println("No se encontró el candidato");
            }

        } catch (SQLException e) {
            System.err.println("Error al conectar: " +   e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
        }
    }
    // 9. Crear nueva oferta
    public static void insertarOferta(Connection conn, String titulo, String tecnologia, String modalidad, int salario, int empresaId) {
        String sql = "INSERT INTO oferta (titulo, tecnologia_clave, modalidad, salario_max, empresa_id, candidato_contratado_id) " +
                "VALUES (?, ?, ?, ?, ?, NULL)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, titulo);
            ps.setString(2, tecnologia);
            ps.setString(3, modalidad);
            ps.setInt(4, salario);
            ps.setInt(5, empresaId);

            ps.executeUpdate();
            System.out.println("Oferta creada correctamente");

        } catch (SQLException e) {
            System.err.println("Error al conectar: " +   e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
        }
    }

    // 10. Eliminar ofertas cerradas
    public static void eliminarOfertasCerradas(Connection conn) {
        String sql = "DELETE FROM oferta WHERE candidato_contratado_id IS NOT NULL";

        try (Statement st = conn.createStatement()) {

            int filas = st.executeUpdate(sql);
            System.out.println("Ofertas eliminadas: " + filas);

        } catch (SQLException e) {
            System.err.println("Error al conectar: " +   e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
        }
    }

    // 11. Reabrir oferta
    public static void reabrirOferta(Connection conn, int idOferta) {
        String sql = "UPDATE oferta SET candidato_contratado_id = NULL WHERE id = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idOferta);
            int filas = ps.executeUpdate();

            if (filas > 0) {
                System.out.println("Oferta reabierta");
            } else {
                System.out.println("No se encontró la oferta");
            }

        } catch (SQLException e) {
            System.err.println("Error al conectar: " +   e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
        }
    }
    // 12. Matching inteligente (JOIN)
    public static void matchingCandidatosOfertas(Connection conn) {
        String sql = "SELECT c.nombre, o.titulo, o.tecnologia_clave " +
                "FROM candidato c " +
                "JOIN oferta o ON o.tecnologia_clave LIKE CONCAT('%', c.perfil_tech, '%') " +
                "WHERE o.candidato_contratado_id IS NULL";

        try (Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println("Candidato: " + rs.getString("nombre"));
                System.out.println("Oferta: " + rs.getString("titulo"));
                System.out.println("Tecnología: " + rs.getString("tecnologia_clave"));
                System.out.println("------------------------");
            }

        } catch (SQLException e) {
            System.err.println("Error al conectar: " +   e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
        }
    }

}