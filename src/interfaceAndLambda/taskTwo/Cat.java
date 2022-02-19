package interfaceAndLambda.taskTwo;

public class Cat implements Animal{


    private String breed;

    @Override
    public void sound() {
        System.out.println("meow");
    }

    @Override
    public void eat() {
        System.out.println("cat eating");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
