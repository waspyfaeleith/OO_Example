import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EdiblePlantTest {
    EdiblePlant plant;

    @Before
    public void before() {
        plant = new EdiblePlant("Carrots", 100, 5.0);
    }

    @Test
    public void hasName() {
        assertEquals("Carrots", plant.getName());
    }

    @Test
    public void hasCalories() {
        assertEquals(100, plant.getCalories());
    }

    @Test
    public void hasNutritionalValue() {assertEquals( 5.0, plant.getNutritionalValue(), 0.01);}
}
