import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;

    public void setName(String name){
        this.name = name;
        return;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player){
        //this.players.add(player);
    }
}
