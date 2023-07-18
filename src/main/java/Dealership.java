import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> stock;
    private double till;


    public Dealership() {
        this.stock = new ArrayList<>();
        this.till = 0;
    }

    public int countVehicles() {
        return this.stock.size();
    }

    public void addVehicles(Vehicle vehicle) {
        this.stock.add(vehicle);
    }

    public void sellVehicle(Vehicle vehicle) {
        this.stock.remove(vehicle);
    }

    public void addToTill(Vehicle vehicle){
        double price = 0;
        for (int i = 0; i < stock.size(); i++) {
            if (stock.get(i).equals(vehicle))
               this.till += vehicle.getSellPrice();

        }

    }

    public double getTillAmount(){
        return this.till;

    }

    public ArrayList<Vehicle> getStock(){
        return this.stock;
    }





}
