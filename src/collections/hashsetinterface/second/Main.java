package collections.hashsetinterface.second;

import java.util.HashSet;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Elementlari butun sonlardan iborat va elementlarini kiritish tartibida saqlovchi set yarating.

        HashSet<Integer> numbers = new HashSet<>(100);

        //Set ga random qilish orqali qiymati 300 dan 500 gacha bo’lgan 100 ta son kiriting.
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            Integer randomNumber = random.ints(300, 500).findFirst().getAsInt();
            numbers.add(randomNumber);
        }

        //print
        System.out.println("****Mixed set****");
        System.out.println(numbers);

        //Qiymati 400 dan katta bo’lgan elementlarini o’chiring.
        numbers.removeIf(i -> i > 400);

        //print
        System.out.println("****Without number over 400****");
        System.out.println(numbers);

    }
}
