public class Kello implements Cloneable {
    private Viisari tuntiViisari;
    private Viisari minuuttiViisari;

    public Kello(Viisari tuntiViisari, Viisari minuuttiViisari) {
        this.tuntiViisari = tuntiViisari;
        this.minuuttiViisari = minuuttiViisari;
    }

    public Viisari getTuntiViisari() {
        return tuntiViisari;
    }

    public Viisari getMinuuttiViisari() {
        return minuuttiViisari;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Kello klooni = (Kello) super.clone();
        // Syväkopiointi
        klooni.tuntiViisari = (Viisari) tuntiViisari.clone();
        klooni.minuuttiViisari = (Viisari) minuuttiViisari.clone();
        return klooni;
    }
}
