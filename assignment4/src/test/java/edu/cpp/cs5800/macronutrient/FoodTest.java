package edu.cpp.cs5800.macronutrient;

import edu.cpp.cs5800.macronutrient.diet.Diet;
import edu.cpp.cs5800.macronutrient.diet.Vegan;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FoodImpl extends Food {

    @Override
    public String getName() {
        return "FoodName";
    }

    @Override
    public String getType() {
        return "FoodType";
    }
}

public class FoodTest {
    @Test
    public void testToString() {
        String expected = String.format("%s(%s)", "FoodType", "FoodName");
        String actual = (new FoodImpl()).toString();
        assertEquals(expected, actual);
    }
}
