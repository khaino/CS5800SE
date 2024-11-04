package edu.cpp.cs5800.addons;

import edu.cpp.cs5800.ChickenBurger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LettuceDecoratorTest {
    ChickenBurger chickenBurger = new ChickenBurger();
    AddOnDecorator decorator = new LettuceDecorator(chickenBurger);

    @Test
    public void testGetPrice() {
        assertEquals(5.5 + 0.5, decorator.getPrice());
    }

    @Test
    public void testGetDescription() {
        String expected = "Chicken Burger       5.50\n+ Lettuce            0.50\n";
        assertEquals(expected, decorator.getDescription());
    }
}
