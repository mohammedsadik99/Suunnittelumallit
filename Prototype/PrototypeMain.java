public class PrototypeMain {
    public static void main(String[] args) {
        Viisari tunti = new Viisari(12);
        Viisari minuutti = new Viisari(0);
        Kello alkuperainen = new Kello(tunti, minuutti);

        try {
            Kello syvakopio = (Kello) alkuperainen.clone();

            alkuperainen.getTuntiViisari().setAika(3);
            alkuperainen.getMinuuttiViisari().setAika(15);

            System.out.println("Alkuperäinen kello: " + alkuperainen.getTuntiViisari().getAika() + ":" + alkuperainen.getMinuuttiViisari().getAika());
            System.out.println("Syväkopioidun kellon aika: " + syvakopio.getTuntiViisari().getAika() + ":" + syvakopio.getMinuuttiViisari().getAika());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
