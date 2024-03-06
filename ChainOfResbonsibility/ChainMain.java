
public class ChainMain {
    public static void main(String[] args) {

        ImmediateSupervisor supervisor = new ImmediateSupervisor();
        UnitManager manager = new UnitManager();
        CEO ceo = new CEO();


        supervisor.setNextHandler(manager);
        manager.setNextHandler(ceo);


        supervisor.handleRequest(0.015);
        supervisor.handleRequest(0.03);
        supervisor.handleRequest(0.06);
    }
}
