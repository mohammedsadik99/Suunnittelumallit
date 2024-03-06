
public class ImmediateSupervisor implements Handler {
    private static final double MAX_INCREASE_ALLOWED = 0.02;
    private Handler nextHandler;

    @Override
    public void handleRequest(double salaryIncrease) {
        if (salaryIncrease <= MAX_INCREASE_ALLOWED) {
            System.out.println("Lähiesimies hyväksyy palkankorotuspyynnön: " + salaryIncrease);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(salaryIncrease);
        }
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
