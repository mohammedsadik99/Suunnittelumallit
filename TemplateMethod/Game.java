public abstract class Game {

    protected int playersCount;
    protected int currentPlayer;
    protected boolean gameOver;

    abstract void initializeGame();

    abstract void makePlay(int player);

    abstract boolean endOfGame();

    abstract void printWinner();

    public final void playOneGame(int playersCount) {
        this.playersCount = playersCount;
        initializeGame();
        currentPlayer = 0;
        while (!gameOver) {
            makePlay(currentPlayer);
            currentPlayer = (currentPlayer + 1) % playersCount;
            gameOver = endOfGame();
        }
        printWinner();
    }
}
