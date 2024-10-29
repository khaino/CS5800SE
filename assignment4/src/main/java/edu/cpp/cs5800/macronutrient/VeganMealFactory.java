package edu.cpp.cs5800.macronutrient;

import edu.cpp.cs5800.macronutrient.carbs.Carbs;
import edu.cpp.cs5800.macronutrient.carbs.CarbsFactory;
import edu.cpp.cs5800.macronutrient.diet.Diet;
import edu.cpp.cs5800.macronutrient.diet.Vegan;
import edu.cpp.cs5800.macronutrient.fats.Fats;
import edu.cpp.cs5800.macronutrient.fats.FatsFactory;
import edu.cpp.cs5800.macronutrient.protein.Protein;
import edu.cpp.cs5800.macronutrient.protein.ProteinFactory;

public class VeganMealFactory extends MacronutrientFactory {
    private static VeganMealFactory instance;
    private final Diet diet = new Vegan();

    private VeganMealFactory() {
    }

    @Override
    public Carbs createCarbs() {
        return CarbsFactory.getInstance().getCarbs(this.diet);
    }

    @Override
    public Protein createProtein() {
        return ProteinFactory.getInstance().getProtein(this.diet);
    }

    @Override
    public Fats createFats() {
        return FatsFactory.getInstance().getFats(this.diet);
    }

    public static VeganMealFactory getInstance() {
        if (instance == null) {
            instance = new VeganMealFactory();
        }
        return instance;
    }
}
