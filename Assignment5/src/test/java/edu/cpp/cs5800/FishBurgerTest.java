package edu.cpp.cs5800;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FishBurgerTest {
    FishBurger fishBurger = new FishBurger();

    @Test
    public void testGetPrice() {
        assertEquals(6.0, fishBurger.getPrice());
    }

    @Test
    public void testGetDescription() {
        String expected = "Fish Burger          6.00\n";
        assertEquals(expected, fishBurger.getDescription());
    }
}
