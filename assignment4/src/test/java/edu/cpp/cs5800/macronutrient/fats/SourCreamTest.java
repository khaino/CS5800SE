package edu.cpp.cs5800.macronutrient.fats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SourCreamTest {

    @Test
    public void testGetName() {
        assertEquals("Sour cream", (new SourCream()).getName());
    }
}
