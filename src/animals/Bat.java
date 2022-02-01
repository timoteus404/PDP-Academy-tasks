package animals;

public class Bat extends Bird{

    private boolean isMammal;

    public Bat() {
    }

    public Bat(boolean isMammal) {
        this.isMammal = isMammal;
    }

    public Bat(int wingLength, boolean isMammal) {
        super(wingLength);
        this.isMammal = isMammal;
    }

    @Override
    public boolean isMammal() {
        return isMammal;
    }

    @Override
    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
}
