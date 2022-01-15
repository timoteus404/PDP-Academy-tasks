package IkkinchiDars;

public class Time {
    /**
     * Quyidagi 3ta attribute bor bo’lgan
     * Time klassini encapsulation prinsipi asosida yarating: soat, minut, va sekund.
     * “soat:minut:sekund” (Masalan: 01:25:08) formatdagi vaqtni qaytaruvchi mehod yarating.
     */
    //private fields
    private int hour;
    private int minute;
    private int seconds;

    //parametrized constructor
    public Time(int hour, int minute, int seconds) {
        //calling setters to assign parameters
        //in order not to be able to change the parameters from constructors
        this.setHour(hour);
        this.setMinute(minute);
        this.setSeconds(seconds);
    }

    //01:25:08 formatdagi vaqtni qaytaruvchi method
    public void printTime(){
        //formatting
        String hourString = this.hour<10?"0"+getHour():""+getHour();
        String min = this.minute<10?"0"+getMinute():""+getMinute();
        String sec = this.seconds<10?"0"+getSeconds():""+getSeconds();
        //printing
        System.out.println(hourString + ":" + min + ":" + sec);
    }

    //Getters and Setters
    //Setters are checking the validity of given time
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour<24 && hour >= 0){
            this.hour = hour;
        }else {
            System.out.println("Time should be between 0 - 60");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute<60&&minute>=0){
            this.minute = minute;
        }else{
            System.out.println("Minutes should be between 0 - 60");
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if(seconds<60 && seconds>= 0){
            this.seconds = seconds;
        }else {
            System.out.println("Seconds should be between 0-60");
        }
    }
}
