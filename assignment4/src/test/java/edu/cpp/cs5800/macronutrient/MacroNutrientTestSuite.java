package edu.cpp.cs5800.macronutrient;

import edu.cpp.cs5800.macronutrient.carbs.CarbsTestSuite;
import edu.cpp.cs5800.macronutrient.diet.DietTestSuite;
import edu.cpp.cs5800.macronutrient.fats.FatsTestSuite;
import edu.cpp.cs5800.macronutrient.protein.*;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        MacroNutrientTestSuite.class,
        MacroNutrientFactoryCreator.class,
        NoRestrictionMealFactoryTest.class,
        NutAllergyMealFactoryTest.class,
        PaleoMealFactoryTest.class,
        VeganMealFactoryTest.class,
        MealTest.class,
        FoodTest.class,
        FoodFactoryTest.class,
        CustomerTest.class,
        ProteinTestSuite.class,
        FatsTestSuite.class,
        CarbsTestSuite.class,
        DietTestSuite.class

})
public class MacroNutrientTestSuite {
}
