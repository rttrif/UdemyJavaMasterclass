package ExpressionsStatementsAndMore;

public class IfThenElseControlSatement {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater then 1000");

        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");

        } else {
            System.out.println("Got here");
        }


        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}
