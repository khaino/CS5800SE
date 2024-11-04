package edu.cpp.cs5800.addons;

import edu.cpp.cs5800.ChickenBurger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TomatoDecoratorTest {
    ChickenBurger chickenBurger = new ChickenBurger();
    AddOnDecorator decorator = new TomatoDecorator(chickenBurger);

    @Test
    public void testGetPrice() {
        assertEquals(5.5 + 1.0, decorator.getPrice());
    }

    @Test
    public void testGetDescription() {
        String expected = "Chicken Burger       5.50\n+ Tomato             1.00\n";
        assertEquals(expected, decorator.getDescription());
    }
}
