package edu.cpp.cs5800.macronutrient.fats;

import edu.cpp.cs5800.macronutrient.carbs.Carbs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FatsImpl extends Fats {
    @Override
    public String getName() {
        return "";
    }
}

public class FatsTest {
    @Test
    public void testGetName() {
        assertEquals("Fats", (new FatsImpl()).getType());
    }
}
