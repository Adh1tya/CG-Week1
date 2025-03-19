public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = null;
        this.price = 0.0;
    }

    
    public void bookTicket(String seatNumber, double price) {
        if (this.seatNumber != null) {
            System.out.println("Error: Ticket is already booked.");
            return;
        }
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket for '" + movieName + "' booked successfully!");
    }

   
    public void displayTicketDetails() {
        if (seatNumber == null) {
            System.out.println("No ticket booked for '" + movieName + "' yet.");
            return;
        }
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }

    
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception");

        
        ticket.displayTicketDetails();

        
        ticket.bookTicket("A10", 15.00);

       
        ticket.displayTicketDetails();

        
        ticket.bookTicket("A11", 18.00);
    }
}
