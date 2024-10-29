package edu.cpp.cs5800.macronutrient.diet;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaleoTest {
    @Test
    public void testGetNonEatableItems() {
        List<String>
                expected =
                List.of("Cheese", "Bread", "Lentils", "Tofu", "Cheese", "Sour cream");
        List<String> actual = (new Paleo()).getNonEatableItems();
        assertEquals(expected, actual);
    }
}
