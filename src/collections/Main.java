package collections;

import collections.first.Circle;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Circle> circles1 = new ArrayList<>();
        circles1.add(new Circle(15.0));
        circles1.add(new Circle(4.5));
        circles1.add(new Circle(3.5));
        circles1.add(new Circle(5.6));
        circles1.add(new Circle(3.14));

        ArrayList<Circle> circles2 = new ArrayList<>();

        circles2.addAll(circles1);

        for(Circle i:circles2){
            System.out.print(i + " ");
        }

    }
}
