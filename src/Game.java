public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    private boolean isBonus;
    private int playCounter;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public Game(Level level1, Level level2, Level level3, boolean isBonus) {
        levelOne = level1;
        levelTwo = level2;
        levelThree = level3;
        this.isBonus = isBonus;
        playCounter = 0;
    }

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public boolean isBonus() {
        return isBonus;
    }

    public int getScore() {
        // TYPE UP YOUR PART A CODE HERE
        // then test with GameTester

        int s=0;

        Level[] levels = {levelOne, levelTwo, levelThree};

        for (Level e : levels) {
            if (e.goalReached()) {
                s+=e.getPoints();
            } else {
                break;
            }
        }

        if (isBonus()) {
            s*=3;
        }

        return s;
    }

    public int playManyTimes(int num) {
        // TYPE UP YOUR PART B CODE HERE
        // then test with GameTester

        int max=Integer.MIN_VALUE;
        while (num>=1){
            num--;
            play();
            int s=getScore();
            if (s>max){max=s;}
        }

        return max;
    }

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public void play() {
        if (playCounter == 0) {
            levelOne = new Level(true, 10);
            levelTwo = new Level(true, 20);
            levelThree = new Level(true, 45);
        } else if (playCounter == 1) {
            levelOne = new Level(true, 15);
            levelTwo = new Level(true, 35);
            levelThree = new Level(false, 25);
        } else if (playCounter == 2) {
            levelOne = new Level(true, 90);
            levelTwo = new Level(false, 35);
            levelThree = new Level(false, 25);
        } else if (playCounter == 3) {
            levelOne = new Level(true, 5);
            levelTwo = new Level(true, 5);
            levelThree = new Level(true, 10);
        } else if (playCounter == 4) {
            levelOne = new Level(true, 50);
            levelTwo = new Level(true, 15);
            levelThree = new Level(true, 35);
        } else if (playCounter == 5) {
            levelOne = new Level(true, 110);
            levelTwo = new Level(false, 50);
            levelThree = new Level(true, 10);
        }
        playCounter++;
    }
}
