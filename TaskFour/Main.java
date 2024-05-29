package TaskFour;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Team team1 = new Team("Det gode hold", new ArrayList<>());
        Team team2 = new Team("Det dårlige hold", new ArrayList<>());

        Tournament tournament = new Tournament("Turneringen", new ArrayList<>());

        Player juniorPlayer1 = new JuniorPlayer("Ingolf");
        Player juniorPlayer2 = new JuniorPlayer("Frederik");
        Player juniorPlayer3 = new JuniorPlayer("Cirkeline");
        Player juniorPlayer4 = new JuniorPlayer("Haletudsen");
        Player juniorPlayer5 = new JuniorPlayer("Storken");
        Player juniorPlayer6 = new JuniorPlayer("Blomsterbarn");

        Player standardPlayer1 = new StandardPlayer("Henning");
        Player standardPlayer2 = new StandardPlayer("Mogens");
        Player standardPlayer3 = new StandardPlayer("Bjarke");
        Player standardPlayer4 = new StandardPlayer("Birger");
        Player standardPlayer5 = new StandardPlayer("Ole");
        Player standardPlayer6 = new StandardPlayer("Børge");

        team1.playerList.add(juniorPlayer1);
        team1.playerList.add(juniorPlayer2);
        team1.playerList.add(juniorPlayer3);
        team1.playerList.add(standardPlayer1);
        team1.playerList.add(standardPlayer2);
        team1.playerList.add(standardPlayer3);
        team2.playerList.add(juniorPlayer4);
        team2.playerList.add(juniorPlayer5);
        team2.playerList.add(juniorPlayer6);
        team2.playerList.add(standardPlayer4);
        team2.playerList.add(standardPlayer5);
        team2.playerList.add(standardPlayer6);

        juniorPlayer1.addPoints(7);
        juniorPlayer2.addPoints(9);
        juniorPlayer3.addPoints(6);
        juniorPlayer4.addPoints(13);
        juniorPlayer5.addPoints(18);
        juniorPlayer6.addPoints(3);

        standardPlayer1.addPoints(14);
        standardPlayer2.addPoints(21);
        standardPlayer3.addPoints(26);
        standardPlayer4.addPoints(18);
        standardPlayer5.addPoints(15);
        standardPlayer6.addPoints(14);

        System.out.println(juniorPlayer1);
        System.out.println(juniorPlayer2);
        System.out.println(standardPlayer1);
        System.out.println(standardPlayer2);
        System.out.println("-----------------");

        team1.addPoints(17);
        team1.addPoints(37);

        System.out.println(team1);
        System.out.println(team2);

        tournament.addPlayer(juniorPlayer1);
        tournament.addPlayer(juniorPlayer2);
        tournament.addPlayer(juniorPlayer3);
        tournament.addPlayer(juniorPlayer4);
        tournament.addPlayer(juniorPlayer5);
        tournament.addPlayer(juniorPlayer6);
        tournament.addPlayer(standardPlayer1);
        tournament.addPlayer(standardPlayer2);
        tournament.addPlayer(standardPlayer3);
        tournament.addPlayer(standardPlayer4);
        tournament.addPlayer(standardPlayer5);
        tournament.addPlayer(standardPlayer6);

        System.out.println("\nThe average score of the tournament is: " + tournament.getAverage());

        tournament.sortPlayersByScore(tournament.players);
        System.out.println("\nThe top ten players by score are: ");
        tournament.printTopTenPlayers(tournament.players);




    }
}
