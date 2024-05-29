package TaskSix;

public class Statistics {

    Die die;


    public Statistics(Die die) {
        this.die = die;
    }


    public int[] results(int numberOfThrows){
        int sides = die.getSides();
        int[] counts = new int[sides];          // For generic use, can use a die with sides N

        for(int i = 0; i < numberOfThrows; i++){
            int roll = die.throwDie();
            counts[roll - 1] ++;
        }
        return counts;
    }

    public void displayResults(int numberOfThrows){
        int[] results = results(numberOfThrows);
        for(int i = 0; i < results.length; i++){
            System.out.println("# of "+ (i + 1) + "'s: " + results[i]);
        }
    }

    public void chanceOfSides(Die die){
        System.out.println("The chance of rolling any side on a die with " + die.getSides() + " sides is: " + 100 / (float) die.getSides() + "%");
    }
}
