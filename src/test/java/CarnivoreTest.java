import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarnivoreTest {
    private Carnivore animal;

    @Before
    public void before() {
        animal = new Carnivore("Tom", "Cat", 5);
    }

    @Test
    public void hasName() {
        assertEquals("Tom", animal.getName());
    }

    @Test
    public void hasSpecies() {
        assertEquals("Cat", animal.getSpecies());
    }

    @Test
    public void hasWeight() {
        assertEquals(5, animal.getWeight(), 0.01);
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
        assertEquals(6, animal.getWeight(), 0.01);
    }

    @Test
    public void canEat() {
        Prey food = new Prey("Jerry", "Mouse", 1, 100, 10.0);
        animal.eat(food);
        assertEquals(1, animal.numberOfItemsInStomach());
        assertEquals(5.01, animal.getWeight(), 0.01);
    }


}
