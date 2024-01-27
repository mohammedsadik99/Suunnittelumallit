public class Jasper {
    private VaateTehdas tehdas;
    private Housut housut;
    private Tpaita tpaita;
    private Lippis lippis;
    private Kengat kengat;

    public Jasper(VaateTehdas tehdas) {
        this.tehdas = tehdas;
        pukeudu();
    }

    private void pukeudu() {
        housut = tehdas.luoHousut();
        tpaita = tehdas.luoTpaita();
        lippis = tehdas.luoLippis();
        kengat = tehdas.luoKengat();
    }

    public void näytäPukeutuminen() {
        System.out.println("Jasperilla on päällään:");
        System.out.println(housut.toString());
        System.out.println(tpaita.toString());
        System.out.println(lippis.toString());
        System.out.println(kengat.toString());
    }

    public void vaihdaVaateTehdas(VaateTehdas uusiTehdas) {
        this.tehdas = uusiTehdas;
        pukeudu();
    }
}