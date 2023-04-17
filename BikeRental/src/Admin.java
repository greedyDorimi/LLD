public class Admin extends Person {

    public Admin(String name, Address address, String email) {
        super(name, address, email);
    }
    public void addVehicleToSystem(Vehicle vehicle) {
        BikeRentalSystem.getInstance().addVehicle(vehicle);
    }

    public void removeVehicleFromSystem(Vehicle vehicle) {
        BikeRentalSystem.getInstance().removeVehicle(vehicle);
    }
}
