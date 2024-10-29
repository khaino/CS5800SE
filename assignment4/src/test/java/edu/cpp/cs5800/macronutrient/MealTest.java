package edu.cpp.cs5800.macronutrient;

import edu.cpp.cs5800.macronutrient.carbs.Bread;
import edu.cpp.cs5800.macronutrient.fats.Avocado;
import edu.cpp.cs5800.macronutrient.protein.Beef;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MealTest {
    @Test
    public void testToString() {
        String expected = "Meal: Carbs(Bread), Fats(Avocado), Protein(Beef)";
        String actual = (new Meal(new Bread(), new Avocado(), new Beef())).toString();
        assertEquals(expected, actual);
    }

    public static class NoRestrictionMealFactoryTest {
    }
}
