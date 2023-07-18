import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelicopterTest {

    private Helicopter helicopter;

    @BeforeEach
    public void setUP(){
        helicopter = new Helicopter(false, 3);
    }

    @Test
    public void canAddWeaponMods(){
        assertThat(helicopter.addWeaponMods(helicopter)).isEqualTo("Weapons added");
    }

    @Test
    public void canCalculateMargin(){
        assertThat(helicopter.calculateMargin()).isEqualTo(750_000);
    }

    @Test
    public void isReservedForAirForce(){
        assertThat(helicopter.isReservedForAirForce()).isEqualTo(false);
    }

    @Test
    public void canGetNumberOfPropellers(){
        assertThat(helicopter.getNumberOfPropellers()).isEqualTo(3);
    }






}
