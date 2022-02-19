package abstractionAndInterface.taskTen.model;

import abstractionAndInterface.taskTen.service.FlyingObject;
import abstractionAndInterface.taskTen.service.Product;
import abstractionAndInterface.taskTen.service.TechProducts;

public class Plane extends Product implements TechProducts, FlyingObject {


    public Plane() {
    }

    public Plane(int price, String producer) {
        super(price, producer);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String getProducer() {
        return super.getProducer();
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public void setProducer(String producer) {
        super.setProducer(producer);
    }

    @Override
    public void turnOn() {
        System.out.println("engine turns on");
    }

    @Override
    public void turnOff() {
        System.out.println("engine turns off");
    }

    @Override
    public void repair() {
        System.out.println("going to repair plant");
    }

    @Override
    public void fly() {
        System.out.println("takes off");
    }

    @Override
    public void land() {
        System.out.println("landing on airport");
    }

    @Override
    public void makeNoise() {

    }
}
