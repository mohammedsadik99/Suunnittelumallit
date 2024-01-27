
public class PoytatietokoneTesti {
    public static void main(String[] args) {

        Laiteosa muistipiiri = new YksittainenLaiteosa("Muistipiiri", 50.0);
        Laiteosa prosessori = new YksittainenLaiteosa("Prosesssori", 200.0);
        Laiteosa verkkokortti = new YksittainenLaiteosa("Verkkokortti", 30.0);
        Laiteosa naytonohjain = new YksittainenLaiteosa("Näytönohjain", 150.0);


        KoosteLaiteosa emolevy = new KoosteLaiteosa("Emolevy");
        emolevy.lisaaLaiteosa(muistipiiri);
        emolevy.lisaaLaiteosa(prosessori);

        KoosteLaiteosa kotelo = new KoosteLaiteosa("Kotelo");
        kotelo.lisaaLaiteosa(emolevy);
        kotelo.lisaaLaiteosa(verkkokortti);
        kotelo.lisaaLaiteosa(naytonohjain);


        double kokonaisHinta = kotelo.haeHinta();
        System.out.println("Kokoonpanon kokonaishinta: " + kokonaisHinta);
    }
}