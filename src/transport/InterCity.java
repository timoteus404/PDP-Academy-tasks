package transport;

public class InterCity extends Train{

    private Type type;

    //constructor
    public InterCity(Type type) {
        this.type = type;
    }

    public InterCity(double ticketPrice, Type type) {
        super(ticketPrice);
        this.type = type;
    }

    //getters and setters
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
