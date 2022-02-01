package animals;

public class Pet extends Animal{

    private String petName;

    public Pet() {
    }

    public Pet(int legs, boolean mammals, String petName) {
        super(legs, mammals);
        this.petName = petName;
    }

    //additional method
    public void makeSound(){
        System.out.println("All pets make sound.");
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
}
