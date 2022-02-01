package abstractionAndInterface.taskOne;

public class Circle extends Shape{

    private double radius;

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
