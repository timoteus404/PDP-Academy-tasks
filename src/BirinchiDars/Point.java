package BirinchiDars;

public class Point {
    /**
     * X va Y koordinatalarni ifodalovchi atributlari bor bo’lgan Point classini yozing.
     * Koordinatalarni “(45, 56)” shaklda chop etuvchi printXY() methodini yozing.
     */

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void printYX(){
        System.out.println("(" + x + "," + y + ")");
    }
}
