public class Viisari implements Cloneable {
    private int aika;

    public Viisari(int aika) {
        this.aika = aika;
    }

    public int getAika() {
        return aika;
    }

    public void setAika(int aika) {
        this.aika = aika;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
