package animals;

public class Dog extends Pet{

    private String breed;

    public Dog() {
    }

    public Dog(int legs, boolean mammals, String petName, String breed) {
        super(legs, mammals, petName);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof!");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
