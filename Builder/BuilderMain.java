public class BuilderMain {
    public static void main(String[] args) {
        BurgerDirector director = new BurgerDirector();

        HesburgerBuilder hesBuilder = new HesburgerBuilder();
        director.makeBurger(hesBuilder);
        Burger hesBurger = hesBuilder.getBurger();
        System.out.println("Hesburger Burger:");
        hesBurger.showParts();

        System.out.println();

        McDonaldsBuilder mcDonaldsBuilder = new McDonaldsBuilder();
        director.makeBurger(mcDonaldsBuilder);
        Burger mcDonaldsBurger = mcDonaldsBuilder.getBurger();
        System.out.println("McDonald's Burger:");
        mcDonaldsBurger.showParts();
    }
}