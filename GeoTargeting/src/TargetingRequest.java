import java.util.HashMap;
import java.util.Set;

public class TargetingRequest {
    private Set<String> state;
    private Set<String> district;
    private Set<String> cities;
    private Set<String> pincode;

    private HashMap<String, String> stateToDistrict;
    private HashMap<String, String> dis

    public TargetingRequest(Set<String> state, Set<String> district, Set<String> cities, Set<String> pincode) {
        this.state = state;
        this.district = district;
        this.cities = cities;
        this.pincode = pincode;
    }

    public Set<String> getState() {
        return state;
    }

    public void setState(Set<String> state) {
        this.state = state;
    }

    public Set<String> getDistrict() {
        return district;
    }

    public void setDistrict(Set<String> district) {
        this.district = district;
    }

    public Set<String> getCities() {
        return cities;
    }

    public void setCities(Set<String> cities) {
        this.cities = cities;
    }

    public Set<String> getPincode() {
        return pincode;
    }

    public void setPincode(Set<String> pincode) {
        this.pincode = pincode;
    }
}
