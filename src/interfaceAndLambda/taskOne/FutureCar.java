package interfaceAndLambda.taskOne;

public class FutureCar implements Car{

    private String model;
    private String company;

    @Override
    public void start() {
        System.out.println("Future car engine starts");
    }

    @Override
    public void run() {
        System.out.println("Runs");
    }

    @Override
    public void stop() {
        System.out.println("stops");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
