public class MementoMain {
    public static void main(String[] args) {
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        for (int i = 1; i <= 10; i++) {
            Guesser arvailija = new Guesser(i, arvuuttaja);
            Thread thread = new Thread(arvailija);
            thread.start();
        }
    }
}
