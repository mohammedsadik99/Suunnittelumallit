public class DiceGame extends Game {
    private int[] scores;
    private int currentPlayer;

    public void setPlayersCount(int playersCount) {
        scores = new int[playersCount];
    }

    @Override
    void initializeGame() {
        System.out.println("Starting the dice game with " + playersCount + " players.");
        currentPlayer = 0;
    }

    @Override
    void makePlay(int player) {
        int roll1 = rollDice();
        int roll2 = rollDice();
        int total = roll1 + roll2;
        scores[currentPlayer] += total;
        System.out.println("Player " + (currentPlayer + 1) + " rolled " + roll1 + " and " + roll2 + ". Total score: " + scores[currentPlayer]);
    }

    @Override
    boolean endOfGame() {
        for (int score : scores) {
            if (score >= 100) {
                return true;
            }
        }
        return false;
    }

    @Override
    void printWinner() {
        System.out.println("Game over! Final scores:");
        for (int i = 0; i < playersCount; i++) {
            System.out.println("Player " + (i + 1) + ": " + scores[i]);
        }
    }

    private int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }
}
