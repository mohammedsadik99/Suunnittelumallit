public class YksittainenLaiteosa implements Laiteosa {
    private String nimi;
    private double hinta;

    public YksittainenLaiteosa(String nimi, double hinta) {
        this.nimi = nimi;
        this.hinta = hinta;
    }

    public double haeHinta() {
        System.out.println(nimi + " hinta: " + hinta);
        return hinta;
    }
}
