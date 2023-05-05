public class SecurityGuard extends Person {
    private MyGateManager myGateManager;
    public SecurityGuard(Integer id, String name, MyGateManager myGateManager) {
        super(id, name);
        myGateManager = MyGateManager.getInstance();
    }

    public void viewVisitors() {
        myGateManager.viewCurrentVisitors();
    }

    public void requestVisitOrExit(Visitor visitor, ActivityType activityType, Address address) {
        if(activityType == ActivityType.EXIT) {
            myGateManager.requestExit(visitor, address);
        } else {
            myGateManager.requestEntry(visitor, address);
        }
    }
}
