public abstract class Vehicle {

    private int id;
    private String no;
    private String name;
    private Address address;
    private VehicleStatus status;

    public Vehicle() {
    }

    public Vehicle(String no, String name, Address address) {
        this.no = no;
        this.name = name;
        this.address = address;
        this.status = VehicleStatus.AVAILABLE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }
}
