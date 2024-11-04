package edu.cpp.cs5800;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VeggieBurgerTest {
    VeggieBurger veggieBurger = new VeggieBurger();

    @Test
    public void testGetPrice() {
        assertEquals(4.5, veggieBurger.getPrice());
    }

    @Test
    public void testGetDescription() {
        String expected = "Veggie Burger        4.50\n";
        assertEquals(expected, veggieBurger.getDescription());
    }
}
