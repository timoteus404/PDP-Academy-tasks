package abstractionAndInterface.taskEight;

public class Cat extends Animal implements Pet{

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Cat is playing");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");;
    }
}
