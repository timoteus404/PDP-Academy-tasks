package interfaceAndLambda.taskTwo;

public class Dog implements Animal{

    private String dogBreed;

    @Override
    public void sound() {
        System.out.println("barking");
    }

    @Override
    public void eat() {
        System.out.println("bone");
    }

    public void guard(){
        System.out.println("guarding dog");
        Animal.run();
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }
}
