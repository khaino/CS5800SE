package edu.cpp.cs5800.macronutrient.diet;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DietImpl extends Diet {
    @Override
    public List<String> getNonEatableItems() {
        return List.of("Abc", "Bcd");
    }
}

public class DietTest {
    @Test
    public void testToString() {
        String
                expected =
                String.format("%s: Restricted%s", "DietImpl", Arrays.asList("Abc", "Bcd"));
        String actual = (new DietImpl()).toString();
        assertEquals(expected, actual);
    }
}
