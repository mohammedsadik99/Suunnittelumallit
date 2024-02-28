import java.util.Random;

public class DiceGame extends Game {

    private int[] playersScores;
    private static final int WINNING_SCORE = 100;

    @Override
    void initializeGame() {
        playersScores = new int[playersCount];
        System.out.println("Welcome to the Dice Game! The objective is to reach " + WINNING_SCORE + " points.");
    }

    @Override
    void makePlay(int player) {
        Random rand = new Random();
        int diceRoll1 = rand.nextInt(6) + 1;
        int diceRoll2 = rand.nextInt(6) + 1;
        int totalScore = diceRoll1 + diceRoll2;
        playersScores[player] += totalScore;
        System.out.println("Player " + (player + 1) + " rolled a " + diceRoll1 + " and a " + diceRoll2 + ". Total score: " + totalScore);
        System.out.println("Player " + (player + 1) + " current score: " + playersScores[player]);
    }

    @Override
    boolean endOfGame() {
        for (int score : playersScores) {
            if (score >= WINNING_SCORE) {
                return true;
            }
        }
        return false;
    }

    @Override
    void printWinner() {
        for (int i = 0; i < playersCount; i++) {
            if (playersScores[i] >= WINNING_SCORE) {
                System.out.println("Player " + (i + 1) + " wins with a score of " + playersScores[i] + "!");
            }
        }
        System.out.println("Final Scores:");
        for (int i = 0; i < playersCount; i++) {
            System.out.println("Player " + (i + 1) + ": " + playersScores[i]);
        }
    }
}
