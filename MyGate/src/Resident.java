public class Resident extends Person {
    private Address address;
    public Resident(Integer id, String name, Address address) {
        super(id, name);
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Boolean approveEntry(Visitor visitor) {
        return (visitor.getName() == "Mansi");
    }

}
