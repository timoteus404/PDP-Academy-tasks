package funtionalInterface.nine;

public class Main {

    public static void main(String[] args) {

        StringCheck containsString = (a,b)-> a.toLowerCase().contains(b.toLowerCase());

        System.out.println(containsString.doesExists("Timur", "ahm"));
    }
}
