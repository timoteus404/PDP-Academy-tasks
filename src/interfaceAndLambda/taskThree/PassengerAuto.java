package interfaceAndLambda.taskThree;

public interface PassengerAuto {

    default void transportPassenger(){
        System.out.println("transport for passengers");
    }
}
