package abstractionAndInterface.taskEight;

public class Spider extends Animal{


    public Spider(){
        System.out.println("Spider class constructor");
    }

    @Override
    public void eat() {
        System.out.println("Spider class eat() method");
    }
}
