import java.util.ArrayList;
import java.util.Date;

public class Season {
    private ArrayList<Match> matchs;
    private String name;
    private Date startDate;
    private Date endDate;

    public ArrayList <Match> getMatchesByDate(Date date){
        return new ArrayList <Match> ();
    }
    public ArrayList <Match> addMatch(Match match){
        return new ArrayList <Match> ();
    }
    public void setName (String name){
        this.name = name;
        return;
    }

    public String getName (){
        return this.name;
    }
    //(Date) -> void
    public void setStartDate (Date startDate){
        this.startDate = startDate;
        return ;
    }
    public void setEndDate (Date endDate){
        this.endDate = endDate;
        return ;
    }
}
