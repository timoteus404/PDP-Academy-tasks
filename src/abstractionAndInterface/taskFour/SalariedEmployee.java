package abstractionAndInterface.taskFour;

public class SalariedEmployee extends Person implements Office{

    private int weeklyPay;

    public void setWage(int weeklyPay){
        this.weeklyPay = weeklyPay;
    }

    public void moveOffice(){

    }


    @Override
    public void setNumber() {

    }

    @Override
    public void getNumber() {

    }

    @Override
    public void setOccupant() {

    }

    @Override
    public void getOccupant() {

    }
}
