package edu.cpp.cs5800.macronutrient;

import edu.cpp.cs5800.macronutrient.carbs.Carbs;
import edu.cpp.cs5800.macronutrient.carbs.CarbsFactory;
import edu.cpp.cs5800.macronutrient.diet.Diet;
import edu.cpp.cs5800.macronutrient.diet.NutAllergy;
import edu.cpp.cs5800.macronutrient.fats.Fats;
import edu.cpp.cs5800.macronutrient.fats.FatsFactory;
import edu.cpp.cs5800.macronutrient.protein.Protein;
import edu.cpp.cs5800.macronutrient.protein.ProteinFactory;

public class NutAllergyMealFactory extends MacronutrientFactory {
    private static NutAllergyMealFactory instance;
    private final Diet diet = new NutAllergy();

    private NutAllergyMealFactory() {
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

    public static NutAllergyMealFactory getInstance() {
        if (instance == null) {
            instance = new NutAllergyMealFactory();
        }
        return instance;
    }
}
