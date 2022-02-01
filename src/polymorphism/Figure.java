package polymorphism;

public class Figure {
    /**
     * Quyidagi amallarni bajaruvchi methodlari
     * bor bo’lgan Figure classini polymorphismni overloading usulini qo’llagan holda yarating:
     * 1)	to’g’ri to’rtburchakning tomonlari  yoki doiraning radiusi berilsa yuzasini hisoblash(area);
     * 2)	to’g’ri to’rtburchakning tomonlari  yoki doiraning radiusi berilsa perimetrini hisoblash(perimetr);
     * 3)	to’g’ri to’rtburchakning tomonlari  yoki doiraning radiusi berilsa ularni chop etish(print)
     */
    private int length;
    private int width;

    public Figure() {
    }

    public Figure(int length, int width) {
        this.length = length;
        this.width = width;
    }

    /**
     * @param length of rectangle
     * @param width of rectangle
     * @return area of a rectangle
     */
    public int rectangle(int length, int width) {
        return length * width;
    }

    /**
     * @param length of rectangle
     * @param width of rectangle
     * @return perimeter of a rectangle
     */
    public double rectangle(double width, double length) {
        return 2 * (length + width);
    }

    //print

    /**
     * @param length of a rectangle
     * @param width of a rectangle
     *
     * void type. prints the length and width of a rectangle.
     */
    public void rectangle(int length, double width) {
        System.out.println("Length: " + length + ", Width: " + width);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
