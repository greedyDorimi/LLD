public class Main {
    public static void main(String[] args) {
        BikeRentalSystem bikeRentalSystem = BikeRentalSystem.getInstance();
        Address address = new Address("Mahavir", 209625, "India", "Farrukhabad");
        Admin admin = new Admin("Mansi", address, "mansi@gmail.com");
        Address bike_address = new Address("Krishna Nagar", 123, "America", "Kanpur");
        Bike bike = new Bike("UP27", "Apache", bike_address);
        admin.addVehicleToSystem(bike);
        bikeRentalSystem.listVehicles();
        bikeRentalSystem.listAvailableVehicles();
    }
}