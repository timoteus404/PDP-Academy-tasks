package interfaceAndLambda.taskTwo;

public interface Animal {

    void sound();

    default void eat(){
        System.out.println("animal eating");
    }

    static void run(){
        System.out.println("animal runs");
    }
}
