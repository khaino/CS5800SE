package edu.cpp.cs5800.macronutrient.carbs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LentilsTest {

    @Test
    public void testGetName() {
        assertEquals("Lentils", (new Lentils()).getName());
    }
}
