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




}
