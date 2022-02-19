package abstractionAndInterface.taslEleven.Model;

import abstractionAndInterface.taslEleven.Service.WheeledVehicle;

public class Bicycles implements WheeledVehicle {

    int BICYCLE_TIRES = 2;

    @Override
    public void getName() {

    }

    @Override
    public void getModel() {

    }

    @Override
    public void getCompany() {

    }

    @Override
    public void maxSpeed() {
        System.out.println("60km/h");
    }
}
