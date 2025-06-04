import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/registro_profesores?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "naty1101";

    public static Connection getConnection() throws SQLException {
        try {
            // Cargar el driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("🚨 No se encontró el driver de MySQL", e);
        }
    }

    public static void main(String[] args) {
        try (Connection connection = getConnection()) {
            System.out.println("✅ ¡Conexión exitosa a la base de datos!");
