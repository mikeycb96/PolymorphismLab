package models;

public class Helicopter extends Vehicle {

    private boolean reservedForAirForce;
    private int numberOfPropellers;

    public Helicopter(boolean isReservedForAirForce, int numberOfPropellers){
        super("Wildcat Mk1", 2_000_000, 1_250_000, "AgustaWestland", 6, "180");
        this.reservedForAirForce = false;
        this.numberOfPropellers = numberOfPropellers;

    }

    public String addWeaponMods(Helicopter helicopter){
        return "Weapons added";
    }

    @Override
    public String getTopSpeed(){
        return "This helicopter has a top speed of 180mph.";

    }


    public boolean isReservedForAirForce(){
        return this.reservedForAirForce;
    }

    public int getNumberOfPropellers(){
        return this.numberOfPropellers;
    }




    public double calculateMargin() {
        return super.sellPrice - super.cost;
    }

}
