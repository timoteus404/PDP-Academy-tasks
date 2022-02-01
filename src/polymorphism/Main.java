package polymorphism;

public class Main {

    public static void main(String[] args) {

        Figure a = new Figure(5,8);

        var i = a.rectangle(2,4);
        System.out.println(i);
        System.out.println(a.rectangle(4.0,5.0));
        a.rectangle(2,5.0);
    }
}
