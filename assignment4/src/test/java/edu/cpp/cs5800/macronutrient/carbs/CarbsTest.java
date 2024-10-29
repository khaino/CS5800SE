package edu.cpp.cs5800.macronutrient.carbs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarbsImpl extends Carbs {
    @Override
    public String getName() {
        return "";
    }
}

public class CarbsTest {
    @Test
    public void testGetName() {
        assertEquals("Carbs", (new CarbsImpl()).getType());
    }
}
