package edu.cpp.cs5800.macronutrient.carbs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheeseTest {

    @Test
    public void testGetName() {
        assertEquals("Cheese", (new Cheese()).getName());
    }
}
