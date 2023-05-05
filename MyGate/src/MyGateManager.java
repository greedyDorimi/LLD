import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyGateManager {
    private HashMap<Visitor, Address> currentVisitors;
    private HashMap<Address, ArrayList<Resident>> society;
    private static Integer totalActivities;

    private static MyGateManager INSTANCE = null;

    public synchronized static MyGateManager getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new MyGateManager();
        }
        return INSTANCE;
    }

    public MyGateManager() {
        totalActivities = 1;
    }

    public HashMap<Visitor, Address> getCurrentVisitors() {
        return currentVisitors;
    }

    public void setCurrentVisitors(HashMap<Visitor, Address> currentVisitors) {
        this.currentVisitors = currentVisitors;
    }

    public static Integer getTotalActivities() {
        return totalActivities;
    }

    public static void setTotalActivities(Integer totalActivities) {
        MyGateManager.totalActivities = totalActivities;
    }

    public Activity generateNotification(Visitor visitor, ActivityType activityType, Address address) {
        Activity activity = new Activity(totalActivities, activityType, visitor, address);
        totalActivities++;
        return activity;
    }

    public void viewCurrentVisitors() {
        for(Map.Entry<Visitor, Address> entry: currentVisitors.entrySet()) {
            System.out.println(entry.getKey().getName());
        }
    }

    public void requestEntry(Visitor visitor, Address address) {
        generateNotification(visitor, ActivityType.ENTRY, address);
            ArrayList<Resident> residents = society.get(address);
            bool gotA
            for(Resident resident: residents) {
                resident.approveEntry(visitor);
            }
    }

    public void requestExit(Visitor visitor, Address address) {
        generateNotification(visitor, ActivityType.EXIT, address);
    }
}
