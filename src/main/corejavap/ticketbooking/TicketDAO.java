package ticketbooking.dao;
import java.sql.*;
import java.ticketbooking.Ticket;
import ticketbooking.DataBaseConnection;

public class TicketDAO {
    public void saveTicket(Ticket ticket) {
        String sql = "INSERT INTO tickets (name, destination, price) VALUES (?, ?, ?)";
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, ticket.getName());
            stmt.setString(2, ticket.getDestination());
            stmt.setDouble(3, ticket.getPrice());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
