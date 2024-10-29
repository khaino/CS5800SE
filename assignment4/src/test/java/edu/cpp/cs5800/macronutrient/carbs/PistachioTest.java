package edu.cpp.cs5800.macronutrient.carbs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PistachioTest {

    @Test
    public void testGetName() {
        assertEquals("Pistachio", (new Pistachio()).getName());
    }
}
