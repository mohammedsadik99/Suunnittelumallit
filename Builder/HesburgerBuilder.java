public class HesburgerBuilder implements BurgerBuilder {
    private Burger burger;

    public HesburgerBuilder() {
        burger = new Burger();
    }

    public void buildBun() {
        burger.addPart("Hesburger Bun");
    }

    public void buildPatty() {
        burger.addPart("Hesburger Patty");
    }

    public void buildCheese() {
        burger.addPart("Hesburger Cheese");
    }

    public void buildSauce() {
        burger.addPart("Hesburger Sauce");
    }

    public Burger getBurger() {
        return burger;
    }
}
