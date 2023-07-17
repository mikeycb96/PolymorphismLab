import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> vehicles;
    private double till;


    public Dealership() {
        this.vehicles = new ArrayList<>();
        this.till = 0;
    }

    public int countVehicles() {
        return this.vehicles.size();
    }

    public void addVehicles(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void sellVehicle(Vehicle vehicle) {
        this.vehicles.remove(vehicle);
    }

    public void addToTill(Vehicle vehicle){
        double price = 0;
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).equals(vehicle))
               this.till += vehicle.getSellPrice();

        }

    }

    public double getTillAmount(){
        return this.till;

    }

    public ArrayList<Vehicle> getVehicles(){
        return this.vehicles;
    }





}
