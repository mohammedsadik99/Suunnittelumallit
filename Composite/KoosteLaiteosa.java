import java.util.ArrayList;
import java.util.List;

public class KoosteLaiteosa implements Laiteosa {
    private String nimi;
    private List<Laiteosa> komponentit = new ArrayList<>();

    public KoosteLaiteosa(String nimi) {
        this.nimi = nimi;
    }

    public void lisaaLaiteosa(Laiteosa laiteosa) {
        komponentit.add(laiteosa);
    }

    public double haeHinta() {
        double kokonaisHinta = 0.0;
        System.out.println(nimi + " koostuu seuraavista osista:");

        for (Laiteosa laiteosa : komponentit) {
            kokonaisHinta += laiteosa.haeHinta();
        }

        System.out.println(nimi + " kokonaishinta: " + kokonaisHinta);
        return kokonaisHinta;
    }
}
