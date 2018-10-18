import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmnivoreTest {
    //private Omnivore jarrod;
    private EdiblePlant veggies;
    private Prey meat;
    private Pizza pizza;

    @Before
    public void before() {

        //jarrod = new Omnivore("Jarrod", "Human", 70);
        veggies= new EdiblePlant("Carrots", 150, 3.0);
        meat = new Prey("Daisy", "Cow", 500, 200, 1.5);
        pizza = new Pizza("Pepperoni", 4000, 0.1);
    }

    /*
    @Test
    public void hasName() {
        assertEquals("Jarrod", jarrod.getName());
    }

    @Test
    public void hasSpecies() {
        assertEquals("Human", jarrod.getSpecies());
    }

    @Test
    public void hasWeight() {
        assertEquals(70, jarrod.getWeight(). 0.01);
    }

    @Test
    public void stomachStartsEmpty() {
        assertEquals(0, jarrod.numberOfItemsInStomach());
    }

    @Test
    public void canSleep() {
        assertEquals("ZZZZ...", jarrod.sleep());
    }

    @Test
    public void canChangeWeight() {
        jarrod.changeWeight(1);
        assertEquals(71, jarrod.getWeight(), 0.01);
    }

    @Test
    public void canEatEdiblePlant() {

        jarrod.eat(veggies);
        assertEquals(1, jarrod.numberOfItemsInStomach());
        assertEquals(71.5, jarrod.getWeight());
    }

    @Test
    public void canEatMeat() {

        jarrod.eat(meat);
        assertEquals(1, jarrod.numberOfItemsInStomach());
        assertEquals(72, jarrod.getWeight());
    }

    @Test
    public void canEatPizza() {

        jarrod.eat(pizza);
        assertEquals(1, jarrod.numberOfItemsInStomach());
        assertEquals(2, jarrod.getWeight(), 0.01);
    }

    @Test
    public void canEatEverything() {

        jarrod.eat(veggies);
        jarrod.eat(meat);
        jarrod.eat(pizza);
        assertEquals(3, jarrod.numberOfItemsInStomach());
        assertEquals(75, jarrod.getWeight(). 0.01);
    }
    */
}
