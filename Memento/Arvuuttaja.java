import java.util.HashMap;
import java.util.Map;

public class Arvuuttaja {
    private final int oikeaNumero;
    private final Map<Thread, Integer> arvaukset;

    public Arvuuttaja() {
        oikeaNumero = (int) (Math.random() * 10); // Arvotaan oikea numero välillä 0-9
        arvaukset = new HashMap<>();
    }

    public synchronized Memento liityPeliin() {
        Thread thread = Thread.currentThread();
        arvaukset.put(thread, -1); // Alustetaan arvaus -1:ksi
        return new Memento(oikeaNumero);
    }

    public synchronized int tarkistaArvaus(Memento memento, int arvaus) {
        if (memento.getOikeaNumero() == arvaus) {
            arvaukset.put(Thread.currentThread(), arvaus);
            return 0; // Arvaus oli oikein
        } else {
            return -1; // Arvaus oli väärin
        }
    }
}
