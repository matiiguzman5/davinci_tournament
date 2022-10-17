public class Player {
    private String name;
    private String position;
    private int goalCounter;
    private int matchCounter;

    public void setName(String name){
        this.name = name;
        return;
    }

    public String getName() {
        return this.name;
    }

    public void setPosition(String position) {
        this.position = position;
        return;
    }

    public String getPosition(){
        return this.position;
    }

    public int getGoalCounter(){
        return this.goalCounter;
    }

    public void setGoalCounter(int goalCounter) {
        this.goalCounter = goalCounter;
        return;
    }

    public void setMatchCounter(int matchCounter) {
        this.matchCounter = matchCounter;
        return;
    }


    public void incrementGoalCounter(){
        //this.goalCounter = this.goalCounter + 1;
        //this.goalCounter += 1;
        this.goalCounter++;
    }

    public int getMatchCounter(){
        return this.matchCounter;
    }

    public void incrementMatchCounter(){
        this.matchCounter++;
    }

}

