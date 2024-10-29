package edu.cpp.cs5800.macronutrient.diet;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NoRestrictionTest {
    @Test
    public void testGetNonEatableItems() {
        assertEquals(List.of(), (new NoRestriction()).getNonEatableItems());
    }
}
