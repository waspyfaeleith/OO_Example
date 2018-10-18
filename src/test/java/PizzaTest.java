import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PizzaTest {
    private Pizza pizza;

    @Before
    public void before() {
        pizza = new Pizza("Pepperoni", 2000, 0.01);
    }

    @Test
    public void hasTopping() {
        assertEquals("Pepperoni", pizza.getTopping());
    }

    @Test
    public void hasCalories() {
        assertEquals(2000, pizza.getCalories());
    }

    @Test
    public void hasNutritionalValue() {
        assertEquals(0.01, pizza.getNutritionalValue(), 0.01);
    }

    @Test
    public void canGetEffectOnWeight() {
        assertEquals(0.2, pizza.effectOnWeight(), 0.01);
    }

}
