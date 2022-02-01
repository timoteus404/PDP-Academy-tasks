package animals;

public class Bird extends Animal{

    private int wingLength;

    public Bird() {
    }

    public Bird(int wingLength) {
        this.wingLength = wingLength;
    }

    public Bird(int legs, boolean mammals, int wingLength) {
        super(legs, mammals);
        this.wingLength = wingLength;
    }
    //additional method
    public void fly(){
        System.out.println("Not all birds fly.");
    }

    public int getWingLength() {
        return wingLength;
    }

    public void setWingLength(int wingLength) {
        this.wingLength = wingLength;
    }
}
