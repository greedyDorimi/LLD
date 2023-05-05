public class Location {
    private String pincode;
    private String city;
    private String district;
    private String state;

    public Location(String state, String district, String city, String pincode) {
        this.pincode = pincode;
        this.city = city;
        this.district = district;
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public String getState() {
        return state;
    }

    public String getValue(LocationType targetingType) {
        switch(targetingType) {
            case PINCODE:
                return pincode;
            case CITY:
                return city;
            case DISTRICT:
                return district;
            case STATE:
                return state;
            default:
                throw new IllegalArgumentException("Invalid targeting type.");
        }
    }

}
