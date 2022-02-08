package abstractionAndInterface.taskFour;

public class HourlyEmployee extends Person{

    private int hourlyRate;
    private int jobID;

    public void setRate(int hourlyRate){
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getJobID() {
        return jobID;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }
}
