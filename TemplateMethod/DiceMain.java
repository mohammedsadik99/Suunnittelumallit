import java.util.Scanner;

public class DiceMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int playersCount = scanner.nextInt();

        Game game = new DiceGame();
        ((DiceGame) game).setPlayersCount(playersCount);
        game.playOneGame();
    }
}
