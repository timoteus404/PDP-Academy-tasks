package animals;

public class Animal {

    /**
     * Har qanday hayvonning oyoqlari(nectaligi) va rangi bor.
     * Ayrim hayvonlarning sut emizuvchilik xususiyati mavjud,
     * Uy havonining ismi(laqabi) bor. Qushlar ham hayvon bo’lib
     * qanotining uzunligi bor va ular uchadigan yoki uchmaydigan bo’lishadi.
     * Tuyaqush uchmaydigan qush va ko’rshapalak sut emizuvchi hisoblanadi.
     * Hayvon (Animal) va uy hayvoni (Pet), qush(Bird), mushuk (Cat), it(Dog),
     * sigir (Cow), Tuyaqush(Straus), Ko'rshapalak(Bat), burgut(Eagle)
     * klasslarini OOPning  inheritance prinsiplari asosida yarating.
     * Klasslarning voris olish sxemasini tuzing. main methodida harbir
     * hayvondan 1 tadan object yarating.
     */

    private int legs;
    private String color;
    private boolean isMammal;

    public Animal() {
    }

    public Animal(int legs, boolean mammals) {
        this.legs = legs;
        this.isMammal = mammals;
    }

    public Animal(int legs, String color, boolean mammals) {
        this.legs = legs;
        this.color = color;
        this.isMammal = mammals;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        this.isMammal = mammal;
    }
}
