package BirinchiDars;

public class Triangle {
    /**
     * To’g’ri burchakli uchburchak klassini yarating.
     * Uning barcha atributlari va methodlariga mos nom va toifa tanlang.
     * (Eni va bo’yi attributlari, Perimetrini va Yuzasini hisoblaydigan 2 ta methodi bo’lsin).
     */
    double length;
    double height;

    public double perimeter(double length, double height){
        return length+height + Math.sqrt(length*length + height*height);
    }

    public double area(double length, double height){
        return (length*height)/2;
    }
}
