// Visitor interface
interface BonusVisitor {
    void visit(NormalState state);
    void visit(PoweredUpState state);
    void visit(InjuredState state);
}
