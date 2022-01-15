package BirinchiDars;

import java.text.DateFormat;

public class Date {
    /**
     * Quyidagi 3ta attribute bor bo’lgan Date klassini yarating:
     * yil, oy va kun.
     * 15.05.2020 formatdagi sanani chop etuvchi mehod yarating.
     */
    int year;
    int month;
    int day;

    public void date(int year, int month, int day){
        String y = year>10?""+year:"0"+year;
        String m = month>10?""+month:"0"+month;
        String d = day>10?""+day:"0"+day;
        System.out.println(d + "." + m + "." + y);
    }
}
