package collections.third;

public class Car {

    private String color;
    private String model;
    private int plateNumber;

    public Car() {
    }

    public Car(String color, String model, int plateNumber) {
        this.color = color;
        this.model = model;
        this.plateNumber = plateNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(int plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", plateNumber=" + plateNumber +
                '}';
    }
}
