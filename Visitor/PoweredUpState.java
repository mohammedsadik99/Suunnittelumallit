class PoweredUpState implements PlayerState {
    @Override
    public void accept(BonusVisitor visitor) {
        visitor.visit(this);
    }
}