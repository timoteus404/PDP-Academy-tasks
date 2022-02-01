package abstractionAndInterface.taskOne;

public class Rectangle extends Shape{

    private double length;
    private double width;

    @Override
    double area() {
        return length*width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
