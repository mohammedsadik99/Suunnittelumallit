
public class UnitManager implements Handler {
    private static final double MAX_INCREASE_ALLOWED = 0.05;
    private Handler nextHandler;

    @Override
    public void handleRequest(double salaryIncrease) {
        if (salaryIncrease > MAX_INCREASE_ALLOWED && nextHandler != null) {
            nextHandler.handleRequest(salaryIncrease);
        } else {
            System.out.println("Yksikön päällikkö hyväksyy palkankorotuspyynnön: " + salaryIncrease);
        }
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
