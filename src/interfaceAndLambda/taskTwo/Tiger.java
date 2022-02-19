package interfaceAndLambda.taskTwo;

public class Tiger implements Animal{

    private String location;

    public void attack(){
        System.out.println("tiger attacks");
        Animal.run();
    }

    @Override
    public void sound() {

    }

    @Override
    public void eat() {
        Animal.super.eat();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
