package abstractionAndInterface.taskFive;

public class Pitcher extends BaseballPlayer{

    private double innings;
    private int earnerRuns;

    public double earnedRunsAverage(){
        return earnerRuns/innings;
    }

    public double getInnings() {
        return innings;
    }

    public void setInnings(double innings) {
        this.innings = innings;
    }

    public int getEarnerRuns() {
        return earnerRuns;
    }

    public void setEarnerRuns(int earnerRuns) {
        this.earnerRuns = earnerRuns;
    }
}
