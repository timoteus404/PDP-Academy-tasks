package funtionalInterface.two;

public class Main {

    public static void main(String[] args) {
        NumberCompaprator findBiggerNumber = Math::max;
        System.out.println(findBiggerNumber.compare(5,-5));
    }
}
