package TaskFour;

import java.util.List;

public class Team implements Player{

    String teamName;
    List<Player> playerList;


    public Team(String teamName, List<Player> playerList) {
        this.teamName = teamName;
        this.playerList = playerList;
    }

    @Override
    public String getName() {
        return teamName;
    }

    @Override
    public float getPoints(){
        float teamPoints = 0;
        for(Player player : playerList){
            teamPoints += player.getPoints();
        }
        return teamPoints;
    }

    @Override
    public void addPoints(float pointsToAdd) {
        float playersOnTeam = playerList.size();
        float pointSplit = pointsToAdd / playersOnTeam;
        for(Player player : playerList){
            player.addPoints(pointSplit);
        }
    }

    @Override
    public String toString() {
        return "Team name: " + getName() + ", Points: " + getPoints();
    }


}
