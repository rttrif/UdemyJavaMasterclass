package ExpressionsStatementsAndMore;

public class Methods {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        calculateScore();

        newCalculateScore(gameOver, score, levelCompleted, bonus);

        newCalculateScore(true, 5000, 8, 150);

        int highScore = intCalculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your INT final score was " + highScore);

    }

    public static void calculateScore() {
//        Hardcode
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static void newCalculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }


    public static int intCalculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }

}
