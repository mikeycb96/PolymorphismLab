import interfaces.IWhatEngine;

public class Car extends Vehicle implements IWhatEngine {

    private int numberOfDoors;
    private String fuelType;

    public Car(int numberOfDoors, String fuelType){
        super("350z", 12_000, 6500, "Nissan", 2, "140");
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;

    }

    public String addSpoiler(){
        return "Spoiler added";

    }

    public String addSpoiler(String customSizeOfSpoiler){
        return customSizeOfSpoiler + " spoiler added";
    }

    public String addWindowTint(){
        return "Window tint added";
    }

    public String whatEngine(String whatEngine){
        return this.name + " has a " + whatEngine + " engine";
    }


    @Override
    public String getTopSpeed(){
        return "This car has a top speed of 150mph.";
    }

//    @Override
//    public String getName(){
//        return super.name;
//    }
//
//    @Override
//    public double getSellPrice(){
//        return super.sellPrice;
//    }
//
//    @Override
//    public double getCost(){
//        return super.cost;
//    }
//
//    @Override
//    public String getManufacturer(){
//        return super.manufacturer;
//    }
//
//    @Override
//    public int getMaximumOccupancy(){
//        return super.maximumOccupancy;


    public int getNumberOfDoors(){
        return this.numberOfDoors;
    }

    public String getFuelType(){
        return this.fuelType;
    }



    public double calculateMargin(){
        return super.sellPrice - super.cost;
    }


}
