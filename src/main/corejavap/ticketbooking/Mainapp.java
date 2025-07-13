package ticketbooking;

import ticketbooking.Ticket;
import ticketbooking.BookingService;
import java.util.*;

public class Mainapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Onlne Ticket Booking ===");
            System.out.println("1. Book Ticket");
            System.out.println("2. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine(); 
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Destination: ");
                    String dest = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    Ticket ticket = new Ticket(name, dest, price);
                    Thread t = new Thread(new BookingService(ticket));
                    t.start();
                    break;

                case 2:
                    running = false;
                    System.out.println("👋 Exiting system.");
                    break;

                default:
                    System.out.println("❌ Invalid option.");
            }
        }

        sc.close();
    }
}
