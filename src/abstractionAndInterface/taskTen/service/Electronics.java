package abstractionAndInterface.taskTen.service;

public abstract class Electronics extends Product{

    String model;
    double voltage;

    public Electronics() {
    }

    public Electronics(int price, String producer, String model, double voltage) {
        super(price, producer);
        this.model = model;
        this.voltage = voltage;
    }
}
