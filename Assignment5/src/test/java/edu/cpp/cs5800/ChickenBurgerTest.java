package edu.cpp.cs5800;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChickenBurgerTest {
    ChickenBurger chickenBurger = new ChickenBurger();

    @Test
    public void testGetPrice() {
        assertEquals(5.5, chickenBurger.getPrice());
    }

    @Test
    public void testGetDescription() {
        String expected = "Chicken Burger       5.50\n";
        assertEquals(expected, chickenBurger.getDescription());
    }
}
