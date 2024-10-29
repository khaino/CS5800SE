package edu.cpp.cs5800.macronutrient.carbs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BreadTest {

    @Test
    public void testGetName() {
        assertEquals("Bread", (new Bread()).getName());
    }
}
