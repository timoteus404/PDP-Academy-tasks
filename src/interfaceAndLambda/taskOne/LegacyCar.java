package interfaceAndLambda.taskOne;

public class LegacyCar implements Car{

    private int price;
    private String location;

    @Override
    public void start() {
        System.out.println("legacy car stops");
    }

    @Override
    public void run() {
        System.out.println("legacy car runs");
    }

    @Override
    public void stop() {
        System.out.println("stops (legacy car)");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
