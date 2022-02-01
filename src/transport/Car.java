package transport;

public class Car extends Vehicle{

    //fields
    private Type style;

    //constructors
    public Car() {
    }

    public Car(String company, String model, String color, int maxCapacity,
               double weight, int maxSpeed, int price, int productionYear, int numOfWheels, Type style) {
        super(company, model, color, maxCapacity, weight, maxSpeed, price, productionYear, numOfWheels);
        this.style = style;
    }

    public Car(Type style) {
        this.style = style;
    }

    //getters and setters
    public Type getStyle() {
        return style;
    }

    public void setStyle(Type style) {
        this.style = style;
    }

}
