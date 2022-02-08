package abstractionAndInterface.taskFive;

public class Goalie extends SoccerPlayer{

    private int goalsAllowed;

    public double averageGoalsAllowed(){
        return getMinutes()/goalsAllowed;
    }

    public int getGoalsAllowed() {
        return goalsAllowed;
    }

    public void setGoalsAllowed(int goalsAllowed) {
        this.goalsAllowed = goalsAllowed;
    }
}
