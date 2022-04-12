package collections.five;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Butun sonlarni kiritish tartibida saqlovchi uzunligi 50 ga teng bo’lgan numbers listini yarating.
        // Ichini 1 dan 100 gacha bo’lgan sonlarni random qilib to’ldiring.

        ArrayList<Integer> numbers = new ArrayList<>(50);
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            Integer randomNumber = random.nextInt(100); //(100-1)gacha random sonlar chiqadi
            numbers.add(i, randomNumber);
        }

        System.out.println(numbers);

    }

}
