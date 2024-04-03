public class BurgerDirector {
    public void makeBurger(BurgerBuilder builder) {
        builder.buildBun();
        builder.buildPatty();
        builder.buildCheese();
        builder.buildSauce();
    }
}