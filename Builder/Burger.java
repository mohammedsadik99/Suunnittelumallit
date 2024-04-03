import java.util.ArrayList;

public class Burger {
    private ArrayList<String> parts;

    public Burger() {
        parts = new ArrayList<>();
    }

    public void addPart(String part) {
        parts.add(part);
    }

    public void showParts() {
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
