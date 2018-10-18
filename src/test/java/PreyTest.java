import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PreyTest {
    private Prey prey;

    @Before
    public void before() {
        prey = new Prey("Sammy", "Salmon", 1, 100, 2.0);
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
        assertEquals(2, prey.getWeight(), 0.01);
    }

    @Test
    public void hasCalories() {
        assertEquals(1000, prey.getCalories());
    }

    @Test
    public void canSleep() {
        assertEquals("ZZZZ...", prey.sleep());
    }

    @Test
    public void canChangeWeight() {
        prey.changeWeight(1);
        assertEquals(3, prey.getWeight(), 0.01);
    }

    @Test
    public void hasNutritionalValue() {assertEquals( 2.0, prey.getNutritionalValue(), 0.01);}

    @Test
    public void canGetWeightEffect() {
        assertEquals(10, prey.weightIncrease(), 0.01);
    }

}
