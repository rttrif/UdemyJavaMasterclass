package ExpressionsStatementsAndMore;

public class MethodOverloading {
    public static void main(String[] args) {
        calculateScore("Tim", 500);

        calculateScore(5220);

        calculateScore();

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");

        return score * 1000;
    }

//    public static int calculateScore(int score) {
//        System.out.println("Unnamed player scored " + score + " points");
//
//        return score * 1000;
//    }

    public static int calculateScore(int score) {
        return calculateScore("Anonymus", score);
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");

        return 0;
    }
}
