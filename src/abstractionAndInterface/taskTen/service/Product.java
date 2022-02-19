package abstractionAndInterface.taskTen.service;

public abstract class Product {

    int price;
    String producer;

    public Product(int price, String producer) {
        this.price = price;
        this.producer = producer;
    }

    public Product() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
