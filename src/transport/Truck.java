package transport;

public class Truck extends Vehicle{

    private int liftingCapacity;

    //constructor
    public Truck() {
    }

    public Truck(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    public Truck(String company, String model, String color, int maxCapacity,
                 double weight, int maxSpeed, int price, int productionYear, int numOfWheels, int liftingCapacity) {
        super(company, model, color, maxCapacity, weight, maxSpeed, price, productionYear, numOfWheels);
        this.liftingCapacity = liftingCapacity;
    }

    //getters and setters
    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }
}
