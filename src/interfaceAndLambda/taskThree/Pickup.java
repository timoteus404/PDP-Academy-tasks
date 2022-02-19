package interfaceAndLambda.taskThree;

public class Pickup implements CargoAuto, PassengerAuto{

    @Override
    public void transportPassenger() {
        System.out.println("truck transports passengers");
    }
}
