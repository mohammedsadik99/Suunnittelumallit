class BonusCalculator implements BonusVisitor {
    @Override
    public void visit(NormalState state) {
        System.out.println("Normal state: 10 bonus points.");
    }

    @Override
    public void visit(PoweredUpState state) {
        System.out.println("Powered-up state: 20 bonus points.");
    }

    @Override
    public void visit(InjuredState state) {
        System.out.println("Injured state: 5 bonus points.");
    }
}