import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EdiblePlantTest {
    EdiblePlant plant;

    @Before
    public void before() {
        plant = new EdiblePlant("Carrots", 3.0);
    }

    @Test
    public void hasName() {
        assertEquals("Carrots", plant.getName());
    }

    @Test
    public void hasNutritionalValue() {assertEquals( 3.0, plant.getNutritionalValue(), 0.01);}

    @Test
    public void canGetEffectOnWeight() {
        assertEquals(0.03, plant.effectOnWeight(), 0.01);
    }
}
