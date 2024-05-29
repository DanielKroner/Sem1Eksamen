package TaskSix;

public class Main {

    public static void main(String[] args) {

        Die die1 = new Die(6);
        Die die2 = new Die(16);
        Statistics stats1 = new Statistics(die1);
        Statistics stats2 = new Statistics(die2);

        stats1.displayResults(1000);
        stats1.chanceOfSides(die1);
        System.out.println("-----------");
        System.out.println("-----------");

        stats2.displayResults(1000);
        stats2.chanceOfSides(die2);
        System.out.println("------------");



    }
}
