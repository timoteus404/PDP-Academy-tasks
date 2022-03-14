package funtionalInterface.one;

public class Main {

    public static void main(String[] args) {

        //First Task
        DefineSign defineSign = (a) -> a>=0?"Musbat":"Manfiy";
        System.out.println(defineSign.sign(2));

    }
}
