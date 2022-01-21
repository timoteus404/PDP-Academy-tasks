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
