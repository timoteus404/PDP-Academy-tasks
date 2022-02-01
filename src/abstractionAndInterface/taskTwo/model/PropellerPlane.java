package abstractionAndInterface.taskTwo.model;

import abstractionAndInterface.taskTwo.service.Aircraft;

public class PropellerPlane extends Aircraft {

    private int propeller;

    //implementation
    @Override
    public void start() {
        System.out.println("Star the engine!");
    }

    @Override
    public void stop() {
        System.out.println("Stop the Engine!");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off");
    }

    @Override
    public void land() {
        System.out.println("Land!");
    }

    public int getPropeller() {
        return propeller;
    }

    public void setPropeller(int propeller) {
        this.propeller = propeller;
    }
}
