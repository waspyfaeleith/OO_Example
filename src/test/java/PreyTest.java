import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PreyTest {
    private Prey prey;

    @Before
    public void before() {
        prey = new Prey("Sammy", "Salmon", 1, 500, 2.0);
    }

    @Test
    public void hasName() {
        assertEquals("Sammy", prey.getName());
    }

    @Test
    public void hasSpecies() {
        assertEquals("Salmon", prey.getSpecies());
    }

    @Test
    public void hasWeight() {
        assertEquals(1, prey.getWeight(), 0.01);
    }

    @Test
    public void hasCalories() {
        assertEquals(500, prey.getCalories());
    }

    @Test
    public void canSleep() {
        assertEquals("ZZZZ...", prey.sleep());
    }

    @Test
    public void canChangeWeight() {
        prey.changeWeight(1);
        assertEquals(2, prey.getWeight(), 0.01);
    }

    @Test
    public void hasNutritionalValue() {assertEquals( 2.0, prey.getNutritionalValue(), 0.01);}

    @Test
    public void canGetEffectOnWeight() {
        assertEquals(0.25, prey.effectOnWeight(), 0.01);
    }

}
