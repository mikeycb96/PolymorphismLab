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
    public void canAddWindowTint(){
        Car m3 = new Car(3, "Petrol");
        assertThat(car.addWindowTint(m3)).isEqualTo("Window tint added");
    }

    @Test
    public void canGetTopSpeed(){
        assertThat(car.getTopSpeed()).isEqualTo("This car has a top speed of 150mph.");
    }


}
