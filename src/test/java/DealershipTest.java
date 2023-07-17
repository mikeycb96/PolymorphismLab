import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DealershipTest {

    private Dealership dealership;
    Vehicle m3;

    @BeforeEach
    public void setUP(){
        dealership = new Dealership();
        m3 = new Car(3, "Petrol");
        dealership.addVehicles(m3);
    }
    @Test
    public void canCountVehicles(){
        assertThat(dealership.countVehicles()).isEqualTo(1);
    }
    @Test
    public void canAddVehicles(){
        Car XC90 = new Car(5, "Petrol");
        dealership.addVehicles(XC90);
        assertThat(dealership.countVehicles()).isEqualTo(2);
    }
    @Test
    public void canSellVehicle(){
        dealership.sellVehicle(m3);
        assertThat(dealership.countVehicles()).isEqualTo(0);

    }

    @Test
    public void canAddToTill(){
        dealership.addToTill(m3);
        assertThat(dealership.getTillAmount()).isEqualTo(12_000);
    }

    @Test
    public void canGetTillAmount(){
        assertThat(dealership.getTillAmount()).isEqualTo(0);
    }

    @Test
    public void canGetVehicles(){
        assertThat(dealership.getVehicles().size()).isEqualTo(dealership.countVehicles());

    }

}
