package collections.third;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    /**
     * 1)	Rangi, modeli va davlat raqami fieldlari bor bo’lgan Car klassini yarating.
     * Main classida Car classidan 10 ta bir xil bo’lmagan object oling.
     * Ichida Car toifasidagi elementlarni saqlaydigan cars nomli
     * List yarating va 10 ta elementni joylashtiring.
     *
     * 2)	Indexdan foydalangan holda cars elementlarini ekranga chiqazing
     * 3)	List ichidan elementlarni random qilib oladigan method yozing.
     * 4)	Uzunligi 5 ga teng bo’lgan, ichida Car toifasidagi elementlarni saqlaydigan cars1 nomli boshqa list yarating va uni ichini to’ldiring. cars1 list elementlarini cars listning 2 indexidan boshlab joylashtiring
     * 5)	cars listni model bo’yicha saralang
     * 6)	cars listidan cars1 listida bor bo’lgan elementlarni o’chiring
     * 7)	cars listidan cars1 listida yo’q bo’lgan elementlarni o’chiring
     */

    public static void main(String[] args) {
        Car car1 = new Car("red", "x", 1234);
        Car car2 = new Car("yellow", "y", 1456);
        Car car3 = new Car("blue", "cheroke", 1597);
        Car car4 = new Car("brown", "F150", 8945);
        Car car5 = new Car("black", "elantra", 5678);
        Car car6 = new Car("white", "altima", 7863);
        Car car7 = new Car("orange", "aventador", 1111);
        Car car8 = new Car("dark blue", "uros", 9876);
        Car car9 = new Car("grey", "corola", 4561);
        Car car10 = new Car("milky", "california", 4444);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);

        for (Car car : cars) {
            System.out.println(car + " ");
        }
        System.out.println("-----------------------");
//        randomElement(cars);
        for (int i = 0; i < cars.size(); i++) {
            randomElement(cars);
        }

        System.out.println("-----------------------");
        /*
        Uzunligi 5 ga teng bo’lgan, ichida Car toifasidagi elementlarni saqlaydigan
        cars1 nomli boshqa list yarating va uni ichini to’ldiring.
        cars1 list elementlarini cars listning 2 indexidan boshlab joylashtiring
         */

        ArrayList<Car> carrss1 = new ArrayList<>(5);
        carrss1.add(new Car("white", "captiva", 7896));
        carrss1.add(new Car("blue", "tico", 21432));
        carrss1.add(new Car("black", "kasha", 19856));
        carrss1.add(new Car("yellow", "masha", 789465));
        carrss1.add(new Car("green", "svarsha", 25945));
    }

    public static void randomElement(ArrayList list){

        Random random = new Random();
        int randomIndex = random.nextInt(list.size());
        System.out.println(list.get(randomIndex));
    }
}
