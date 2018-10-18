import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PizzaTest {
    private Pizza pizza;

    @Before
    public void before() {
        pizza = new Pizza("Pepperoni", 2, 0.1);
    }

    @Test
    public void hasTopping() {
        assertEquals("Pepperoni", pizza.getTopping());
    }

    @Test
    public void hasCalories() {
        assertEquals(2, pizza.getCalories());
    }

    @Test
    public void hasNutritionalValue() {
        assertEquals(0.1, pizza.getNutritionalValue(), 0.01);
    }

}
