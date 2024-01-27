// AdidasTehdas.java
public class AdidasTehdas implements VaateTehdas {
    public Housut luoHousut() {
        return new AdidasHousut();
    }

    public Tpaita luoTpaita() {
        return new AdidasTpaita();
    }

    public Lippis luoLippis() {
        return new AdidasLippis();
    }

    public Kengat luoKengat() {
        return new AdidasKengat();
    }
}
