import javax.xml.stream.Location;
import java.util.Date;

public class Match {
    private String location;
    private Date date;
    private Team localTeam;
    private Team visitantTeam;
    private int localGoalCounter;
    private int visitantGoalCounter;

    Match(){
        this.setLocalGoalCounter(0);
        this.setVisitantGoalCounter(0);
    }

    Match(String location, Date date){
        this.setLocalGoalCounter(0);
        this.setVisitantGoalCounter(0);
        this.setDate(date);
        this.setLocation(location);
    }

    Match(String location, Date date, Team local , Team visitant){
        this.setLocalGoalCounter(0);
        this.setVisitantGoalCounter(0);
        this.setDate(date);
        this.setLocation(location);
        this.setLocalTeam(local);
        this.setVisitantTeam(visitant);
    }

    public void makeGoal(Team team, Player player){
        if (team.getName() == this.localTeam.getName()) {
            this.localGoalCounter++;
    }
    if (team.getName() == this.getVisitantTeam().getName()) {
        this.visitantGoalCounter++;
    }
    player.incrementGoalCounter();
}


    public String generateMarker () {
        //return this.getLocalCounter() + "-" + getVisitantGoalCounter();
        return String.format("%s (%d) - (%d) %s",
                this.getLocalTeam().getName(),
                this.getLocalCounter() ,
                this.getVisitantGoalCounter(),
                this.getVisitantTeam().getName()
        );
    }

    public void setLocation(String location){
        this.location = location;
        return;
    }
    public String getLocation(){
        return this.location;
    }

    public void setDate(Date date){
        this.date = date;
        return;
    }
    public Date getdate(){
        return this.date;
    }
    public void setLocalTeam(Team localTeam){
        this.localTeam = localTeam;
    }
    public void setVisitantTeam(Team visitantTeam){
        this.visitantTeam = visitantTeam;
    }
    public Team getLocalTeam(){
        return this.localTeam;
    }
    public void incrementLocalCounter(){
        this.localGoalCounter++;
    }

    public int getLocalCounter(){
        return this.localGoalCounter;
    }

    public void setLocalGoalCounter(int localGoalCounter) {
        this.localGoalCounter = localGoalCounter;
        return;
    }
    public void setVisitantGoalCounter(int visitantGoalCounter) {
        this.visitantGoalCounter = visitantGoalCounter;
        return;
    }

    public int getVisitantGoalCounter() {
        return visitantGoalCounter;
    }

    public Team getVisitantTeam() {
        return visitantTeam;
    }
}
