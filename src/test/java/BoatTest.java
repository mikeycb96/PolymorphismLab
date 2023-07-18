import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BoatTest {

    private Boat boat;

    @BeforeEach
    public void setUp(){
        boat = new Boat(20);

    }

    @Test
    public void canAddFishingRodHolders(){
        assertThat(boat.addFishingRodHolders(boat)).isEqualTo("Fishing rod holders added to your boat");
    }

    @Test
    public void canGetTopSpeed(){
        assertThat(boat.getTopSpeed()).isEqualTo("This boat has a top speed of 46mph.");
    }

    @Test
    public void canCalculateMargin(){
        assertThat(boat.calculateMargin()).isEqualTo(25_000);
    }

    @Test
    public void canGetSizeInFeet(){
        assertThat(boat.getSizeInFeet()).isEqualTo(20);
    }

}
