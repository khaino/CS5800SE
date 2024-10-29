package edu.cpp.cs5800.macronutrient.diet;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VeganTest {
    @Test
    public void testGetNonEatableItems() {
        List<String> expected = List.of("Fish", "Chicken", "Tuna", "Cheese", "Sour cream");
        List<String> actual = (new Vegan()).getNonEatableItems();
        assertEquals(expected, actual);
    }
}
