import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BikeRentalSystem {
    private HashMap<Integer, Vehicle> vehicles;
    private static BikeRentalSystem INSTANCE = null;

    private int vehicle_id;

    private BikeRentalSystem() {
        this.vehicles = new HashMap<>();
        this.vehicle_id = 1;
    }

    public static BikeRentalSystem getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new BikeRentalSystem();
        }
        return INSTANCE;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicle.setId(vehicle_id);
        vehicles.put(vehicle.getId(), vehicle);
        vehicle_id++;
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle.getId());
    }

    public void listVehicles() {
        for(Map.Entry<Integer, Vehicle> vehicle: vehicles.entrySet()) {
            System.out.println(vehicle.getValue().getName()+ " ");
        }
    }

    public void listAvailableVehicles() {
        for(Map.Entry<Integer, Vehicle> vehicle: vehicles.entrySet()) {
            if(vehicle.getValue().getStatus() == VehicleStatus.AVAILABLE)System.out.println(vehicle.getValue().getName() + " ");
        }
    }
}
