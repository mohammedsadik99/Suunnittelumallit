public class Main {
    public static void main(String[] args) {
        // Aluksi käytetään Adidasta
        VaateTehdas adidasTehdas = new AdidasTehdas();
        Jasper jasper = new Jasper(adidasTehdas);
        jasper.näytäPukeutuminen();

        // Jasper valmistuu insinööriksi ja siirtyy käyttämään Bossia
        VaateTehdas bossTehdas = new BossTehdas();
        jasper.vaihdaVaateTehdas(bossTehdas);
        jasper.näytäPukeutuminen();
    }
}