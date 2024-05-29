package TaskFour;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tournament {

    String name;
    List<Player> players;


    public Tournament(String name, List<Player> players) {
        this.name = name;
        this.players = players;
    }

    public float getAverage(){
        if(players.isEmpty()) {
            return 0;
        }
        float totalPoints = 0;
        for(Player player : players) {
            totalPoints += player.getPoints();
        }
        return totalPoints/players.size();
    }

    public String getName() {
        return name;
    }

    public void sortPlayersByScore(List<Player> players){
        Collections.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player player1, Player player2) {
                return Float.compare(player2.getPoints(), player1.getPoints());
            }
        });
    }

    public static void printTopTenPlayers(List<Player> players){
        int topCount = Math.min(players.size(), 10);
        for(int i = 0; i < topCount; i++) {
            System.out.println(players.get(i));
        }
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    @Override
    public String toString() {
        return "Tournament name: " + getName() + ", the average score is: " + getAverage();
    }

}
