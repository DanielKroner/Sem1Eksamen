package TaskFour;

public class StandardPlayer implements Player {

    String name;
    float points;


    public StandardPlayer(String name) {
        this.name = name;
        this.points = 0;
    }

    @Override
    public float getPoints(){
        return points;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addPoints(float pointsToAdd){
        points += pointsToAdd;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Points: " + getPoints();
    }


}
