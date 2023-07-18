public class Boat extends Vehicle {

    private int sizeInFeet;

    public Boat(int size){
        super("DX2000", 40_000, 15_000, "Bayliner", 4, "46");
        this.sizeInFeet = 20;
    }

    public String addFishingRodHolders(Boat boat){
        return "Fishing rod holders added to your boat";
    }
    public int getSizeInFeet(){
        return this.sizeInFeet;
    }

    @Override
    public String getTopSpeed(){
        return "This boat has a top speed of 46mph.";
    }




    public double calculateMargin() {
        return super.sellPrice - super.cost;
    }

}
