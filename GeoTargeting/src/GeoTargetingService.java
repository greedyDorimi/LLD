import java.util.*;

class GeoTargetingService {
    private Map<String, Map<String, Targeting>> namespaceTargetings;
    public static GeoTargetingService INSTANCE = null;

    public static GeoTargetingService getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new GeoTargetingService();
        }
        return INSTANCE;
    }

    private GeoTargetingService() {
        namespaceTargetings = new HashMap<>();
    }

    public String createTargeting(String namespace, TargetingRequest request) {
        Targeting targeting = new Targeting(request);
        if( !namespaceTargetings.containsKey(namespace) ) {
            namespaceTargetings.put(namespace, new HashMap<>());
        }
        String targetingID = targeting.getTargetingID();
        namespaceTargetings.get(namespace).put(targetingID, targeting);
        return targetingID;
    }
    public boolean checkTargeting(String namespace, String targetingID, Location userLocationData) {
        Targeting targeting = namespaceTargetings.get(namespace).get(targetingID);
        return targeting.checkLocation(userLocationData);
    }

    public List<String> checkAllTargeting(String namespace, Location userLocationData) {
        Map<String, Targeting> targetings = namespaceTargetings.get(namespace);
        List<String> satisfiedTargetings = new ArrayList<>();
        for(Map.Entry<String, Targeting> entry : targetings.entrySet()){
            if (entry.getValue().checkLocation(userLocationData)) {
                satisfiedTargetings.add(entry.getKey());
            }
        }
        return satisfiedTargetings;
    }

    public List<String> getTargeting(String namespace) {
        if( !namespaceTargetings.containsKey(namespace) ) {
            System.out.println("Invalid namespace");
            return new ArrayList<>();
        }
        return new ArrayList<String>(namespaceTargetings.get(namespace).keySet());
    }

    public void updateTargeting(String namespace, String targetingID, TargetingRequest request) {
        Targeting targeting = namespaceTargetings.get(namespace).get(targetingID);
        targeting.update(request);
    }

    public void deleteTargeting(String namespace, String targetingID) {
        namespaceTargetings.get(namespace).remove(targetingID);
    }
}
