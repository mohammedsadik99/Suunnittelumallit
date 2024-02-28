public class Pokemon {
    private PokemonState currentState;

    public Pokemon() {

        currentState = new CharmanderState();
    }


    public void performAction() {

        currentState.execute();

        nextState();
    }

    private void nextState() {
        if (currentState instanceof CharmanderState) {
            currentState = new CharmeleonState();
        } else if (currentState instanceof CharmeleonState) {
            currentState = new CharizardState();
        }

        else if (!(currentState instanceof CharizardState)) {

            currentState = new CharmanderState();
        }
    }
}
