package TaskFour;

public class JuniorPlayer implements Player {

    String name;
    float points;


    public JuniorPlayer(String name) {
        this.name = name;
        this.points = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getPoints() {
        return points;
    }

    @Override
    public void addPoints(float pointsToAdd) {
        points += (float) (pointsToAdd * 1.5);
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Points: " + getPoints();
    }
}
