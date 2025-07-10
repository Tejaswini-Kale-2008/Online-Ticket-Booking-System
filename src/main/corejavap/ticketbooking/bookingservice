
import java.io.*;

public class BookingService implements Runnable {
    private Ticket ticket;

    public BookingService(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        try (FileWriter writer = new FileWriter("tickets.txt", true)) {
            writer.write(ticket.toString() + "\n");
            new TicketDAO().saveTicket(ticket);
            System.out.println("🎫 Ticket booked: " + ticket.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
