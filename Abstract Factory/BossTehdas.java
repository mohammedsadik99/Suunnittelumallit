public class BossTehdas implements VaateTehdas {
    public Housut luoHousut() {
        return new BossHousut();
    }

    public Tpaita luoTpaita() {
        return new BossTpaita();
    }

    public Lippis luoLippis() {
        return new BossLippis();
    }

    public Kengat luoKengat() {
        return new BossKengat();
    }
}