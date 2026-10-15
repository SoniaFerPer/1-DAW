import java.sql.*;

public class Main {
    private static final String user = "root";
    private static final String password = "admin";
    private static final String url = "jdbc:mysql://localhost:33060/tinder_laboral";

    public static void main(String[] args) {

        //1. EJERCICIO
        listarCandidatos();
        System.out.println("-------------------------------");
        //2. EJERCICIO
        ofertasDisponibles();
        System.out.println("-------------------------------");
        //3. EJERCICIO
        insertarCandidato("Sandra Mejide","sandramej@gmail.com","frontEnd",2,23000);
        System.out.println("-------------------------------");
        //4. EJERCICIO
        subirSalario(2);
        System.out.println("-------------------------------");
        //5. EJERCICIO
        eliminarCandidato("sandramej@gmail.com");
        System.out.println("-------------------------------");
        //6. EJERCICIO
        contraofertaFullstack();
        System.out.println("-------------------------------");
        //7. EJERCICIO
        mostrarStartups();
        System.out.println("-------------------------------");
        //9. EJERCICIO
        insertarOferta("Ingeniero de Software","Kotlin","Remoto",34000,3);
        System.out.println("-------------------------------");
        //10. EJERCICIO
        eliminarOfertasCerradas();
        System.out.println("-------------------------------");
        //10. EJERCICIO
        ofertasDisponibles();
        System.out.println("-------------------------------");
        //11. EJERCICIO
        reabrirOferta(3);
        System.out.println("-------------------------------");
        //12. EJERCICIO
        matchingCandidatos();
        System.out.println("-------------------------------");


    }

    public static Connection conectar (String url){
        try{
            return DriverManager.getConnection(url,user,password);

        }catch (SQLException e){
            System.err.println("Error al conectar: " +   e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
            return null;
        }
    }

    public static void listarCandidatos(){
        String sql = "SELECT * FROM candidato WHERE perfil_tech = 'Frontend' ORDER BY nombre";

        try(Connection conn = conectar(url);
            PreparedStatement psmt = conn.prepareStatement(sql);
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

    // 2. Ofertas abiertas con salario >= 24000
    public static void ofertasDisponibles() {
        String sql = "SELECT titulo, tecnologia_clave, salario_max " +
                "FROM oferta WHERE candidato_contratado_id IS NULL AND salario_max >= 24000";

        try (Connection conn = conectar(url);
             Statement st = conn.createStatement();
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
    public static void insertarCandidato(String nombre, String email, String perfil, int exp, int salario) {
        String sql = "INSERT INTO candidato (nombre, email, perfil_tech, experiencia_anios, salario_esperado) " +
                "VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = conectar(url);
             PreparedStatement ps = conn.prepareStatement(sql)) {

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
    public static void subirSalario(int idOferta) {
        String sql = "UPDATE oferta SET salario_max = salario_max + 2000 WHERE id = ?";

        try (Connection conn = conectar(url);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idOferta);
            ps.executeUpdate();

            System.out.println("Salario actualizado");

        } catch (SQLException e) {
            System.err.println("Error al conectar: " +   e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
        }
    }

    // 5. Eliminar candidato por email
    public static void eliminarCandidato(String email) {
        String sql = "DELETE FROM candidato WHERE email = ?";

        try (Connection conn = conectar(url);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, email);
            ps.executeUpdate();

            System.out.println("Candidato eliminado");

        } catch (SQLException e) {
            System.err.println("Error al conectar: " +   e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
        }
    }

    // 6. Contraoferta
    public static void contraofertaFullstack() {
        String sql = "UPDATE oferta SET modalidad = 'Remoto', salario_max = salario_max + 5000 " +
                "WHERE titulo = 'Fullstack Web Developer'";

        try (Connection conn = conectar(url);
             Statement st = conn.createStatement()) {

            st.executeUpdate(sql);
            System.out.println("Contraoferta aplicada");

        } catch (SQLException e) {
            System.err.println("Error al conectar: " +   e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
        }
    }

    // 7. Mostrar startups
    public static void mostrarStartups() {
        String sql = "SELECT nombre, sede FROM empresa WHERE es_startup = 1 ORDER BY nombre";

        try (Connection conn = conectar(url);
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println("Empresa: " + rs.getString("nombre"));
                System.out.println("Sede: " + rs.getString("sede"));
            }

        } catch (SQLException e) {
            System.err.println("Error al conectar: " +   e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
        }
    }
    // 8. Actualizar experiencia
    public static void actualizarExp(String email) {
        String sql = "UPDATE candidato SET experiencia_anios = experiencia_anios + 1 WHERE email = ?";

        try (Connection conn = conectar(url);
             PreparedStatement ps = conn.prepareStatement(sql)) {

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

    // 9. insertar oferta
    public static void insertarOferta(String titulo, String tecnologia, String modalidad, int salario, int empresaId) {
        String sql = "INSERT INTO oferta (titulo, tecnologia_clave, modalidad, salario_max, empresa_id, candidato_contratado_id) " +
                "VALUES (?, ?, ?, ?, ?, NULL)";

        try (Connection conn = conectar(url);
             PreparedStatement ps = conn.prepareStatement(sql)) {

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
    public static void eliminarOfertasCerradas() {
        String sql = "DELETE FROM oferta WHERE candidato_contratado_id IS NOT NULL";

        try (Connection conn = conectar(url);
             Statement st = conn.createStatement()) {

            int filas = st.executeUpdate(sql);
            System.out.println("Ofertas eliminadas: " + filas);

        } catch (SQLException e) {
            System.err.println("Error al conectar: " +   e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
        }
    }
    // 11. Reabrir oferta
    public static void reabrirOferta(int idOferta) {
        String sql = "UPDATE oferta SET candidato_contratado_id = NULL WHERE id = ?";

        try (Connection conn = conectar(url);
             PreparedStatement ps = conn.prepareStatement(sql)) {

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

    // 12. Matching inteligente
    public static void matchingCandidatos() {
        String sql = "SELECT c.nombre, o.titulo, o.tecnologia_clave " +
                "FROM candidato c " +
                "JOIN oferta o ON o.tecnologia_clave LIKE CONCAT('%', c.perfil_tech, '%') " +
                "WHERE o.candidato_contratado_id IS NULL";

        try (Connection conn = conectar(url);
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println("Candidato: " + rs.getString("nombre"));
                System.out.println("Oferta: " + rs.getString("titulo"));
                System.out.println("Tecnología: " + rs.getString("tecnologia_clave"));

            }

        } catch (SQLException e) {
            System.err.println("Error al conectar: " +   e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
        }
    }
}