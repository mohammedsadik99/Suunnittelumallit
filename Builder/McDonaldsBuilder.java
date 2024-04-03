public class McDonaldsBuilder implements BurgerBuilder {
    private StringBuilder burger;

    public McDonaldsBuilder() {
        burger = new StringBuilder();
    }

    public void buildBun() {
        burger.append("McDonald's Bun\n");
    }

    public void buildPatty() {
        burger.append("McDonald's Patty\n");
    }

    public void buildCheese() {
        burger.append("McDonald's Cheese\n");
    }

    public void buildSauce() {
        burger.append("McDonald's Sauce\n");
    }

    public Burger getBurger() {
        Burger mcdonaldsBurger = new Burger();
        String[] parts = burger.toString().split("\n");
        for (String part : parts) {
            mcdonaldsBurger.addPart(part);
        }
        return mcdonaldsBurger;
    }
}
