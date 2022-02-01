package abstractionAndInterface.taskTwo.service;

public abstract class Aircraft {

    String color;
    Object engine;

//    void start(){};

    //implementation
    public abstract void start();

//    void stop(){};

    public abstract void stop();

//    void takeOff(){};

    public abstract void takeOff();

//    void land(){};

    public abstract void land();
}
