import java.util.List;

public class StrategyMain {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "C", "D", "E", "F");


        ListConverter strategy1 = new EveryElementStrategy();
        System.out.println("Strategy 1:");
        System.out.println(strategy1.listToString(list));

        ListConverter strategy2 = new EverySecondElementStrategy();
        System.out.println("Strategy 2:");
        System.out.println(strategy2.listToString(list));

        ListConverter strategy3 = new EveryThirdElementStrategy();
        System.out.println("Strategy 3:");
        System.out.println(strategy3.listToString(list));
    }
}
