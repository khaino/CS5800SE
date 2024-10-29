package edu.cpp.cs5800.macronutrient.fats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TunaTest {

    @Test
    public void testGetName() {
        assertEquals("Tuna", (new Tuna()).getName());
    }
}
