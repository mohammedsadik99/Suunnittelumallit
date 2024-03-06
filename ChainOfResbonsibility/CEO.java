
public class CEO implements Handler {
    @Override
    public void handleRequest(double salaryIncrease) {
        System.out.println("Toimitusjohtaja käsittelee palkankorotuspyynnön: " + salaryIncrease);
    }
}
