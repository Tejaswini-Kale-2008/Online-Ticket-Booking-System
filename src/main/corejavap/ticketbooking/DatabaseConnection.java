package ticketbooking;
import java.sql.*;

public class DatabaseConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/ticketdb";
    private static final String USER = "postgres";
    private static final String PASS = "tej@swinikale2008"; 

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
             throw new RuntimeException("❌ Failed to connect to the database.", e);
            
        }
    }
}
