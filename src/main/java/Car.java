public class Car extends Vehicle {

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

    public String addWindowTint(Car car){
        return "Window tint added";
    }

    @Override
    public String getTopSpeed(){
        return "This car has a top speed of 150mph.";
    }


}
