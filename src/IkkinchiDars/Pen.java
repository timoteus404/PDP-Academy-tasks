package IkkinchiDars;

public class Pen {
    /**
     * write methodini  ruchka kotta harfni yozganda kichik
     * harfga qaraganda 2 marta ko'p siyoh sarflaydigan, probel (bo'sh joy)
     * ni yozganda siyoh sarflanmaydigan va siyoh tugagan payt yozishdan
     * to'xtaydigan qilib o'zgartirish
     */
    private boolean button;
    private double ink;
    private String inkColor;
    private double inkConsumption;

    //parametrized constructor;
    public Pen(boolean button, double ink, String inkColor, double inkConsumption) {
        this.button = button;
        this.ink = ink;
        this.inkColor = inkColor;
        this.inkConsumption = inkConsumption;
    }

    public Pen(boolean button, double ink, double inkConsumption) {
        this.setButton(button);
        this.setInk(ink);
        this.setInkConsumption(inkConsumption);
    }

    public Pen(double ink, String inkColor, double inkConsumption) {
        this.setInk(ink);
        this.setInkColor(inkColor);
        this.setInkConsumption(inkConsumption);
    }

    //no agr constructor
    public Pen() {
    }

    //method to write a word and calculate the consumption of ink
    public void write(String word){

        for (int i = 0; i < word.length()&&ink>0; i++) {
            char index = word.charAt(i);
            //checking space char
            if (Character.isSpaceChar(index)) {
                System.out.print(index);
            //checking upper case chars
            }else if(Character.isUpperCase(index)){
                if(ink>=inkConsumption){
                    System.out.print(index);
                    ink -= inkConsumption*2;
                }else {
                    System.out.println("\nRuchkada Siyoh Qolmadi.");
                    break;
                }
            //checking lowercase chars
            }else if(Character.isLowerCase(index)){
                if(ink>=inkConsumption){
                    System.out.print(index);
                    ink-=inkConsumption;
                }
                if(ink == 0){
                    System.out.println("\nRuchkada Siyoh Qolmadi.");
                    break;
                }
            }
        }


    }

    //click button
    public void clickButton(){
        button=!button;
    }

    //changes the reservoir of pen
    public void changeReservoir(double ink){
        this.ink = ink;
    }

    public boolean isButton() {
        return button;
    }

    public void setButton(boolean button) {
        this.button = button;
    }

    public double getInk() {
        return ink;
    }

    public void setInk(double ink) {
        if(ink>0){
            this.ink = ink;
        }else{
            System.out.println("Siyohni Miqdori Musbat Bo'lishi Lozim.");
        }

    }

    public String getInkColor() {
        return inkColor;
    }

    public void setInkColor(String inkColor) {
        this.inkColor = inkColor;
    }

    public double getInkConsumption() {

        return inkConsumption;
    }

    public void setInkConsumption(double inkConsumption) {
        if(inkConsumption>0){
            this.inkConsumption = inkConsumption;
        }
    }
}
