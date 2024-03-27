public class VisitorMain {
    public static void main(String[] args) {
        PlayerCharacter player = new PlayerCharacter("Mario", new NormalState());

        BonusVisitor bonusVisitor = new BonusCalculator();

        player.accept(bonusVisitor);

        player.setState(new PoweredUpState());
        player.accept(bonusVisitor);
    }
}