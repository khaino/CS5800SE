package edu.cpp.cs5800.macronutrient;

import edu.cpp.cs5800.macronutrient.carbs.Carbs;
import edu.cpp.cs5800.macronutrient.carbs.CarbsFactory;
import edu.cpp.cs5800.macronutrient.diet.NoRestriction;
import edu.cpp.cs5800.macronutrient.diet.Vegan;
import edu.cpp.cs5800.macronutrient.fats.Fats;
import edu.cpp.cs5800.macronutrient.protein.Protein;

public class NoRestrictionMealFactory extends MacronutrientFactory {
    private static NoRestrictionMealFactory instance;
    @Override
    public Carbs createCarbs() {
        CarbsFactory factory = CarbsFactory.getInstance();
        return factory.getRandomCarbs(new Vegan());
    }

    @Override
    public Protein createProtein() {
        return null;
    }

    @Override
    public Fats createFats() {
        return null;
    }

    public static NoRestrictionMealFactory getInstance() {
        if (instance == null) {
            instance = new NoRestrictionMealFactory();
        }
        return instance;
    }
}
