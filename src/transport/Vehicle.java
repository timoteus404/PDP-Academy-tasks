package transport;

public class Vehicle extends Transport {

    //fields
    private int numOfWheels;

    //constructors
    public Vehicle() {
    }

    public Vehicle(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public Vehicle(String company, String model, String color, int maxCapacity,
                   double weight, int maxSpeed, int price, int productionYear, int numOfWheels) {
        super(company, model, color, maxCapacity, weight, maxSpeed, price, productionYear);
        this.numOfWheels = numOfWheels;
    }

    //getters and setters
    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        if (numOfWheels > 0) {
            this.numOfWheels = numOfWheels;
        } else {
            System.out.println("Wheels Should Be More Than Zero.");
        }
    }
}
