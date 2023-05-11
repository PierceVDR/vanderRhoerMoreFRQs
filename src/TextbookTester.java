public class TextbookTester {
    public static void main(String[] args) {
        System.out.println("------- Q2 Testing --------");
        Textbook bio2015 = new Textbook("Biology", 49.75, 2);
        Textbook bio2019 = new Textbook("Biology", 39.75, 3);
        boolean testPass = true;
        int returnVal = bio2019.getEdition();
        System.out.println(returnVal);
        if (returnVal != 3) {
            testPass = false;
        }
        String returnStr = bio2019.getBookInfo();
        System.out.println(returnStr);
        if (!returnStr.equals("Biology-39.75-3")) {
            testPass = false;
        }
        boolean returnBool = bio2019.canSubstituteFor(bio2015);
        System.out.println(returnBool);
        if (!returnBool) {
            testPass = false;
        }
        returnBool = bio2015.canSubstituteFor(bio2019);
        System.out.println(returnBool);
        if (returnBool) {
            testPass = false;
        }
        Textbook math = new Textbook("Calculus", 45.25, 1);
        returnBool = bio2015.canSubstituteFor(math);
        System.out.println(returnBool);
        if (returnBool) {
            testPass = false;
        }
        if (testPass) {
            System.out.println("--> TEST PASSED");
        } else {
            System.out.println("--> !!!!!TEST FAILED!!!!!");
        }
    }
}
