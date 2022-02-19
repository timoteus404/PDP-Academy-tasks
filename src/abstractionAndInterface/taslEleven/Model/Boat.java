package abstractionAndInterface.taslEleven.Model;

import abstractionAndInterface.taslEleven.Service.Vehicle;

public class Boat implements Vehicle {


    @Override
    public void getName() {
        System.out.println("Something");
    }

    @Override
    public void getModel() {
        System.out.println("some new model");
    }

    @Override
    public void getCompany() {
        System.out.println("some company");
    }

    @Override
    public void maxSpeed() {
        System.out.println("20 miles per hour");
    }
}
