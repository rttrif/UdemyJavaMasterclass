package ExpressionsStatementsAndMore;

public class IfThenElseControlSatement {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 400;
        int levelCompleted = 5;
        int bonus = 1000;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater then 1000");

        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");

        } else {
            System.out.println("Got here");
        }


    }
}
