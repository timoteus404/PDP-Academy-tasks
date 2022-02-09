package abstractionAndInterface.taskEight;

public class Animal {

    private int legs;

    public Animal() {
    }

    public Animal(int legs) {
        this.legs = legs;
    }

    public void walk(){
        System.out.println("walk method in animal class");
    }
    public void eat(){
        System.out.println("eat class in animal class");
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
