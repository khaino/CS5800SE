package edu.cpp.cs5800.addons;

import edu.cpp.cs5800.ChickenBurger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PicklesDecoratorTest {
    ChickenBurger chickenBurger = new ChickenBurger();
    AddOnDecorator decorator = new PicklesDecorator(chickenBurger);

    @Test
    public void testGetPrice() {
        assertEquals(5.5 + 1.2, decorator.getPrice());
    }

    @Test
    public void testGetDescription() {
        String expected = "Chicken Burger       5.50\n+ Pickles            1.20\n";
        assertEquals(expected, decorator.getDescription());
    }
}
