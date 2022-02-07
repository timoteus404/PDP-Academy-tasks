package abstractionAndInterface.taskTwo.service;

public abstract class Aircraft {

    private String color;
    private Object engine;

    //implementation
    public abstract void start();

    public abstract void stop();

    public abstract void takeOff();

    public abstract void land();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Object getEngine() {
        return engine;
    }

    public void setEngine(Object engine) {
        this.engine = engine;
    }
}
