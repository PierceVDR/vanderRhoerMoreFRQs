public class GameTester {
    public static void main(String[] args) {
        System.out.println("------- Q1 Part A Testing --------");
        Level level1 = new Level(true, 200);
        Level level2 = new Level(true, 100);
        Level level3 = new Level(true, 500);
        Game game = new Game(level1, level2, level3, true);
        boolean testPass = true;
        int returnVal = game.getScore();
        System.out.println(returnVal);
        if (returnVal != 2400) {
            testPass = false;
        }
        level3 = new Level(false, 500);
        game = new Game(level1, level2, level3, false);
        returnVal = game.getScore();
        System.out.println(returnVal);
        if (returnVal != 300) {
            testPass = false;
        }
        level2 = new Level(false, 100);
        level3 = new Level(true, 500);
        game = new Game(level1, level2, level3, true);
        returnVal = game.getScore();
        System.out.println(returnVal);
        if (returnVal != 600) {
            testPass = false;
        }
        level1 = new Level(false, 200);
        level2 = new Level(true, 100);
        game = new Game(level1, level2, level3, false);
        returnVal = game.getScore();
        System.out.println(returnVal);
        if (returnVal != 0) {
            testPass = false;
        }
        if (testPass) {
            System.out.println("--> TEST PASSED");
        } else {
            System.out.println("--> !!!!!TEST FAILED!!!!!");
        }
        System.out.println("\n------- Q1 Part B Testing --------");
        Level level1a = new Level(true, 200);
        Level level2a = new Level(true, 100);
        Level level3a = new Level(true, 500);
        Game gameA = new Game(level1a, level2a, level3a, false);
        testPass = true;
        returnVal = gameA.playManyTimes(4);
        System.out.println(returnVal);
        if (returnVal != 90) {
            testPass = false;
        }
        gameA = new Game(level1a, level2a, level3a, false);
        returnVal = gameA.playManyTimes(2);
        System.out.println(returnVal);
        if (returnVal != 75) {
            testPass = false;
        }
        gameA = new Game(level1a, level2a, level3a, false);
        returnVal = gameA.playManyTimes(6);
        System.out.println(returnVal);
        if (returnVal != 110) {
            testPass = false;
        }
        if (testPass) {
            System.out.println("--> TEST PASSED");
        } else {
            System.out.println("--> !!!!!TEST FAILED!!!!!");
        }
    }
}
