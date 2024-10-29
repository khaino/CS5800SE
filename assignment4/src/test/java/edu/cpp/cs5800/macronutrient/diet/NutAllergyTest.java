package edu.cpp.cs5800.macronutrient.diet;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NutAllergyTest {
    @Test
    public void testGetNonEatableItems() {
        assertEquals(List.of("Pistachio", "Peanuts"), (new NutAllergy()).getNonEatableItems());
    }
}
