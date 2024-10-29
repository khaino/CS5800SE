package edu.cpp.cs5800.macronutrient.fats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvocadoTest {

    @Test
    public void testGetName() {
        assertEquals("Avocado", (new Avocado()).getName());
    }
}
