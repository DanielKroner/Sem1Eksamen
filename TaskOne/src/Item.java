package TaskOne.src;

public class Item {

    public String description;
    public boolean isDone;

    public Item(String description, boolean isDone) {
        this.description = description;
        this.isDone = isDone;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    // ToString override

    @Override
    public String toString() {
        return description + ", " + (isDone ? "done" : "not done");
    }
}
