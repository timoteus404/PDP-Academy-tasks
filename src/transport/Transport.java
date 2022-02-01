package transport;

public class Transport {

    //fields
    private String company;
    private String model;
    private String color;
    private int maxCapacity;
    private double weight;
    private int maxSpeed;
    private int price;
    private int productionYear;

    //constructor
    public Transport() {
    }

    public Transport(int maxCapacity, int maxSpeed, int price) {
        this.maxCapacity = maxCapacity;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public Transport(String color, int maxCapacity, double weight, int maxSpeed) {
        this.color = color;
        this.maxCapacity = maxCapacity;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    public Transport(String company, String model, String color, int maxCapacity,
                     double weight, int maxSpeed, int price, int productionYear) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxCapacity = maxCapacity;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.productionYear = productionYear;
    }

    //methods
    public void start() {
        System.out.println("On start!");
    }

    public void stop() {
        System.out.println("Stopped!");
    }

    public void honk(){
        System.out.println("beep, beep!!!");
    }

    //getters and setters
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}
