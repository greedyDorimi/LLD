public class Address {
    private String street_address;
    private int pin_code;
    private String country;
    private String city;

    public Address(String street_address, int pin_code, String country, String city) {
        this.street_address = street_address;
        this.pin_code = pin_code;
        this.country = country;
        this.city = city;
    }

    public String getStreet_address() {
        return street_address;
    }

    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

    public int getPin_code() {
        return pin_code;
    }

    public void setPin_code(int pin_code) {
        this.pin_code = pin_code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
