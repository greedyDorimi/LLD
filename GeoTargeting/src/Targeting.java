import java.util.*;

class Targeting {
    private Map<LocationType, Set<String>> locationRules;

    private String targetingID;

    public Targeting() {
        locationRules = new HashMap<>();
        targetingID = "";
    }

    public Targeting(TargetingRequest request) {
        locationRules = new HashMap<>();
        targetingID = UUID.randomUUID().toString();

        // Add location rules based on the request
        if (request.getState() != null) {
            locationRules.put(LocationType.STATE, new HashSet<>(request.getState()));
        }
        if (request.getDistrict() != null) {
            locationRules.put(LocationType.DISTRICT, new HashSet<>(request.getDistrict()));
        }
        if (request.getCities() != null) {
            locationRules.put(LocationType.CITY, new HashSet<>(request.getCities()));
        }
        if (request.getPincode() != null) {
            locationRules.put(LocationType.PINCODE, new HashSet<>(request.getPincode()));
        }
    }


    public boolean checkLocation(Location location) {
        for (LocationType locationType : locationRules.keySet()) {
            Set<String> locationValues = locationRules.get(locationType);
            if (locationValues != null && !locationValues.isEmpty()) {
                String locationValue = location.getValue(locationType);
                if (locationValue != null && locationValues.contains(locationValue)) {

                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public void update(TargetingRequest request) {
        locationRules.clear();
        if (request.getState() != null) {
            locationRules.put(LocationType.STATE, new HashSet<>(request.getState()));
        }
        if (request.getDistrict() != null) {
            locationRules.put(LocationType.DISTRICT, new HashSet<>(request.getDistrict()));
        }
        if (request.getCities() != null) {
            locationRules.put(LocationType.CITY, new HashSet<>(request.getCities()));
        }
        if (request.getPincode() != null) {
            locationRules.put(LocationType.PINCODE, new HashSet<>(request.getPincode()));
        }
    }

    public String getTargetingID() {
        return targetingID;
    }

}
