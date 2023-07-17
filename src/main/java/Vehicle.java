public abstract class Vehicle {

    protected String name;
    protected double sellPrice;
    protected double cost;
    protected String manufacturer;
    protected int maximumOccupancy;
    protected String topSpeed;

    public Vehicle(String name, double sellPrice, double cost, String manufacturer, int maximumOccupancy, String topSpeed){
        this.name = name;
        this.sellPrice = sellPrice;
        this.cost = cost;
        this.manufacturer = manufacturer;
        this.maximumOccupancy = maximumOccupancy;
        this.topSpeed = topSpeed;
    }


    public double calculateMargin(){
        return this.sellPrice - this.cost;
    }

    public double getSellPrice(){
        return this.sellPrice;

    }

    public String getTopSpeed(){
        return "This vehicle has a top speed of 130mph";
    }





}
