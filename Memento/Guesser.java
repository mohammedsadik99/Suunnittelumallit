public class Guesser implements Runnable {
    private final Arvuuttaja arvuuttaja;
    private final int id;

    public Guesser(int id, Arvuuttaja arvuuttaja) {
        this.id = id;
        this.arvuuttaja = arvuuttaja;
    }

    @Override
    public void run() {
        while (true) {
            Memento memento = arvuuttaja.liityPeliin();
            int arvaus = arvaaLuku();
            int tulos = arvuuttaja.tarkistaArvaus(memento, arvaus);
            if (tulos == 0) {
                System.out.println("Arvailija " + id + " arvasi oikein numeron " + arvaus);
                break;
            } else {
                System.out.println("Arvailija " + id + " arvasi numeron " + arvaus + ", mutta se oli väärin.");
            }
        }
    }

    public int arvaaLuku() {
        return (int) (Math.random() * 10);
    }
}
