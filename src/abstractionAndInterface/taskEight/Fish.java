package abstractionAndInterface.taskEight;

public class Fish extends Animal implements Pet{

    private String name;

    public Fish() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Fish is playing");
    }

    @Override
    public void walk() {
        System.out.println("How fish can walk?");;
    }

    @Override
    public void eat() {
        System.out.println("Fish is eating");;
    }
}
