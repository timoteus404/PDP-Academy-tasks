package interfaceAndLambda.taskOne;

public interface Car {

    void start();
    void run();
    void stop();
    default void fly(){
        System.out.println("flying car");
    }
}
