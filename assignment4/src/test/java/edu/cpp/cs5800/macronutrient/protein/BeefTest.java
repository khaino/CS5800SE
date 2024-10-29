package edu.cpp.cs5800.macronutrient.protein;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeefTest {

    @Test
    public void testGetName() {
        assertEquals("Beef", (new Beef()).getName());
    }
}
