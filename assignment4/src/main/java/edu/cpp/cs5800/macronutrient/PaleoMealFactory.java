package edu.cpp.cs5800.macronutrient;

import edu.cpp.cs5800.macronutrient.carbs.Carbs;
import edu.cpp.cs5800.macronutrient.carbs.CarbsFactory;
import edu.cpp.cs5800.macronutrient.diet.Diet;
import edu.cpp.cs5800.macronutrient.diet.NutAllergy;
import edu.cpp.cs5800.macronutrient.diet.Paleo;
import edu.cpp.cs5800.macronutrient.diet.Vegan;
import edu.cpp.cs5800.macronutrient.fats.Fats;
import edu.cpp.cs5800.macronutrient.fats.FatsFactory;
import edu.cpp.cs5800.macronutrient.protein.Protein;
import edu.cpp.cs5800.macronutrient.protein.ProteinFactory;

public class PaleoMealFactory extends MacronutrientFactory {
    private static PaleoMealFactory instance;
    private final Diet diet = new Paleo();

    private PaleoMealFactory() {
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

    public static PaleoMealFactory getInstance() {
        if (instance == null) {
            instance = new PaleoMealFactory();
        }
        return instance;
    }
}
