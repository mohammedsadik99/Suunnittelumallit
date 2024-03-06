import java.util.List;


public interface ListConverter {
    String listToString(List<String> list);
}

class EveryElementStrategy implements ListConverter {
    @Override
    public String listToString(List<String> list) {
        StringBuilder result = new StringBuilder();
        for (String element : list) {
            result.append(element).append("\n");
        }
        return result.toString();
    }
}

class EverySecondElementStrategy implements ListConverter {
    @Override
    public String listToString(List<String> list) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            result.append(list.get(i));
            if ((i + 1) % 2 == 0) {
                result.append("\n");
            }
        }
        return result.toString();
    }
}

// Kolmas strategia: Rivinvaihto joka kolmannen alkion jälkeen käyttäen List-rajapinnan get-metodia
class EveryThirdElementStrategy implements ListConverter {
    @Override
    public String listToString(List<String> list) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            result.append(list.get(i));
            if ((i + 1) % 3 == 0) {
                result.append("\n");
            }
        }
        return result.toString();
    }
}
