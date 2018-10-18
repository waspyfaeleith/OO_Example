import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlantTest {
    private Plant plant;

    @Before
    public void before(){
        plant = new Plant("Deadly Nightshade");
    }

    @Test
    public void hasName() {
        assertEquals("Deadly Nightshade", plant.getName());
    }

    @Test
    public void canGrow() {
        assertEquals("getting bigger...", plant.grow());
    }
}
