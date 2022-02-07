package abstractionAndInterface.taskTwo.model;

import abstractionAndInterface.taskTwo.service.Aircraft;

public class FighterPlane extends Aircraft {

    private Object engine;

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

    @Override
    public Object getEngine() {
        return engine;
    }

    @Override
    public void setEngine(Object engine) {
        this.engine = engine;
    }


}
