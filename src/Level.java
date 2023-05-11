public class Level {
    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    private boolean goalReached;
    private int points;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public Level(boolean goalReached, int points) {
        this.goalReached = goalReached;
        this.points = points;
    }

    public boolean goalReached() {
        return goalReached;
    }

    public int getPoints() {
        return points;
    }
}
