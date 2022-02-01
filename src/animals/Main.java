package animals;

public class Main {
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
    public static void main(String[] args) {

        Bat bat = new Bat(true);
        System.out.println(bat.isMammal());

        Eagle eagle = new Eagle();
        eagle.fly();

        Straus straus = new Straus();
        straus.fly();

        Cat cat = new Cat();
        cat.makeSound();

        Cow cow = new Cow();
        cow.makeSound();

        Dog dog = new Dog();
        dog.makeSound();



    }
}
