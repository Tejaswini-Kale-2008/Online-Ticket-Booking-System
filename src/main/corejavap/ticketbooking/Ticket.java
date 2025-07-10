package ticketbooking;

public class Ticket {
    
    private String name;
    private String destination;
    private double price;

    public Ticket(String name, String destination, double price) {
       
        this.name = name;
        this.destination = destination;
        this.price = price;
    }

    public String getName() 
    { 
        return name; }
    public String getDestination() 
    { 
        return destination; }
    public double getPrice() 
    { 
        return price; }

    @Override
    public String toString() {
        return "Ticket{name='" + name + "', destination='" + destination + "', price=" + price + "}";
    }
}

