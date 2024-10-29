package edu.cpp.cs5800.macronutrient;

import edu.cpp.cs5800.macronutrient.carbs.Carbs;
import edu.cpp.cs5800.macronutrient.fats.Fats;
import edu.cpp.cs5800.macronutrient.protein.Protein;

public abstract class MacronutrientFactory {
    public abstract Carbs createCarbs();
    public abstract Protein createProtein();
    public abstract Fats createFats();
}
