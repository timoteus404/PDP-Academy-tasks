package interfaceAndLambda.taskThree;

public class Pickup implements CargoAuto, PassengerAuto{

    public void transportCargo(){
        System.out.println("transportCargo method from Pickup class");
    }

    @Override
    public void transportPassenger() {
        System.out.println("truck transports passengers");
    }
}
