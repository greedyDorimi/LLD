import java.util.ArrayList;

public class Customer extends Account {
    private int total_vehicles_rented;
    private ArrayList<Vehicle> reserved_vehicles;

    public Customer(int total_vehicles_rented, ArrayList<Vehicle> reserved_vehicles) {
        this.total_vehicles_rented = total_vehicles_rented;
        this.reserved_vehicles = reserved_vehicles;
    }

    public int getTotal_vehicles_rented() {
        return total_vehicles_rented;
    }

    public void setTotal_vehicles_rented(int total_vehicles_rented) {
        this.total_vehicles_rented = total_vehicles_rented;
    }

    public ArrayList<Vehicle> getReserved_vehicles() {
        return reserved_vehicles;
    }

    public void setReserved_vehicles(ArrayList<Vehicle> reserved_vehicles) {
        this.reserved_vehicles = reserved_vehicles;
    }
}
