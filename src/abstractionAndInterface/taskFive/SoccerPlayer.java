package abstractionAndInterface.taskFive;

public class SoccerPlayer extends Player{

    private int minutes;
    private int goals;

    public double goalsPerGame(){
        return minutes/goals; //should be revised
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }
}
