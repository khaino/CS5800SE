package edu.cpp.cs5800.macronutrient;

import edu.cpp.cs5800.macronutrient.diet.Diet;
import edu.cpp.cs5800.macronutrient.diet.NutAllergy;
import edu.cpp.cs5800.macronutrient.diet.Paleo;
import edu.cpp.cs5800.macronutrient.diet.Vegan;

public class FactoryCreator {
    public static MacronutrientFactory getMacronutrientFactory(Diet diet) {
        return switch (diet) {
            case Vegan vegan -> VeganMealFactory.getInstance();
            case NutAllergy nutAllergy -> NutAllergyMealFactory.getInstance();
            case Paleo paleo -> PaleoMealFactory.getInstance();
            case null, default -> NoRestrictionMealFactory.getInstance();
        };
    }
}
