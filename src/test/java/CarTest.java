import models.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    private Car car;




    @BeforeEach
    public void setUP(){

        car = new Car(3, "Petrol");


    }

    @Test
    public void canAddSpoiler(){
        assertThat(car.addSpoiler()).isEqualTo("Spoiler added");


    }

    @Test
    public void canAddSpecificSizeOfSpoiler(){
        String expected = "Large spoiler added";
        String actual = car.addSpoiler("Large");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canAddWindowTint(){
        Car m3 = new Car(3, "Petrol");
        assertThat(m3.addWindowTint()).isEqualTo("Window tint added");
    }

    @Test
    public void canWhatEngine(){
        String expected = "350z has a V6 engine";
        String actual = car.whatEngine("V6");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetTopSpeed(){
        assertThat(car.getTopSpeed()).isEqualTo("This car has a top speed of 150mph.");
    }

    @Test
    public void canCalculateMargin(){
        assertThat(car.calculateMargin()).isEqualTo(5_500);

    }

    @Test
    public void canGetNumberOfDoors(){
        assertThat(car.getNumberOfDoors()).isEqualTo(3);
    }

    @Test
    public void canGetFuelType(){
        assertThat(car.getFuelType()).isEqualTo("Petrol");
    }


    @Test
    public void canGetName(){
        assertThat(car.getName()).isEqualTo("350z");
    }

    @Test
    public void canGetSellPrice(){
        assertThat(car.getSellPrice()).isEqualTo(12_000);
    }

    @Test
    public void canGetCost(){
        assertThat(car.getCost()).isEqualTo(6_500);
    }

    @Test
    public void canGetManufacturer(){
        assertThat(car.getManufacturer()).isEqualTo("Nissan");
    }

    @Test
    public void canGetMaximumOccupancy(){
        assertThat(car.getMaximumOccupancy()).isEqualTo(2);
    }



}
