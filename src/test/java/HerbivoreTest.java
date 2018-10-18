import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HerbivoreTest {

    private Herbivore animal;

    @Before
    public void before() {
        animal = new Herbivore("Red Rum", "Horse", 450);
    }

    @Test
    public void hasName() {
        assertEquals("Red Rum", animal.getName());
    }

    @Test
    public void hasSpecies() {
        assertEquals("Horse", animal.getSpecies());
    }

    @Test
    public void hasWeight() {
        assertEquals(450, animal.getWeight(), 0.01);
    }

    @Test
    public void stomachStartsEmpty() {
        assertEquals(0, animal.numberOfItemsInStomach());
    }

    @Test
    public void canSleep() {
        assertEquals("ZZZZ...", animal.sleep());
    }

    @Test
    public void canChangeWeight() {
        animal.changeWeight(1);
        assertEquals(451, animal.getWeight(), 0.01);
    }

    @Test
    public void canEat() {
        EdiblePlant food = new EdiblePlant("Grass", 10, 100);
        animal.eat(food);
        assertEquals(1, animal.numberOfItemsInStomach());
        assertEquals(451, animal.getWeight(), 0.01);
    }


}
