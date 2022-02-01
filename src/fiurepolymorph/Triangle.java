package fiurepolymorph;

public final class Triangle extends Figure {

    private int sideA;
    private int sideB;
    private int hypotenuse;

    public Triangle() {
    }

    public Triangle(int sideA, int sideB, int hypotenuse) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.hypotenuse = hypotenuse;
    }

    //Right Triangle A = ½ × Base (B) × Height(A)
    @Override
    double area() {
        return 0.5 * sideB * sideA;
    }

    @Override
    double perimeter() {
        return sideA + sideB + hypotenuse;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(int hypotenuse) {
        this.hypotenuse = hypotenuse;
    }
}
