package edu.cpp.cs5800.macronutrient;

import edu.cpp.cs5800.macronutrient.diet.NoRestriction;
import edu.cpp.cs5800.macronutrient.diet.Vegan;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class MacroNutrientFactoryCreatorTest {

    @Test
    public void testCreateFactoryForNonDefault() {
        MacronutrientFactory factory = MacroNutrientFactoryCreator.createFactory(new Vegan());
        assertInstanceOf(VeganMealFactory.class, factory);
    }

    @Test
    public void testCreateFactoryForDefault() {
        MacronutrientFactory
                factory =
                MacroNutrientFactoryCreator.createFactory(new NoRestriction());
        assertInstanceOf(NoRestrictionMealFactory.class, factory);
    }
}
