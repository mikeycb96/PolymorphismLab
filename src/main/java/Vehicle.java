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


    public abstract double calculateMargin();

    public double getSellPrice(){
        return this.sellPrice;

    }

    public double getCost(){
        return this.cost;
    }

    public String getName(){
        return this.name;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }

    public int getMaximumOccupancy(){
        return this.maximumOccupancy;
    }

    public String getTopSpeed(){
        return this.topSpeed;
    }






}
