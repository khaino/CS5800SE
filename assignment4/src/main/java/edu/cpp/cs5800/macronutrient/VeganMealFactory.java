package edu.cpp.cs5800.macronutrient;

import edu.cpp.cs5800.macronutrient.carbs.Carbs;
import edu.cpp.cs5800.macronutrient.carbs.CarbsFactory;
import edu.cpp.cs5800.macronutrient.diet.Vegan;

public class VeganMeal extends MacronutrientFactory {

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
}
