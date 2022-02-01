package transport;

public class Train extends Transport {

    private double ticketPrice;


    public Train() {
    }

    public Train(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Train(int maxCapacity, int maxSpeed, int price, double ticketPrice) {
        super(maxCapacity, maxSpeed, price);
        this.ticketPrice = ticketPrice;
    }

    public Train(String color, int maxCapacity, double weight, int maxSpeed, double ticketPrice) {
        super(color, maxCapacity, weight, maxSpeed);
        this.ticketPrice = ticketPrice;
    }


    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
