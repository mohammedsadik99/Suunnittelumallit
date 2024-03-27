// Context class representing the player character
class PlayerCharacter implements PlayerState {
    private String name;
    private PlayerState state;

    public PlayerCharacter(String name, PlayerState state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    // Method to set the state of the player character
    public void setState(PlayerState state) {
        this.state = state;
    }

    // Method to get the current state of the player character
    public PlayerState getState() {
        return state;
    }

    @Override
    public void accept(BonusVisitor visitor) {
        state.accept(visitor);
    }
}
