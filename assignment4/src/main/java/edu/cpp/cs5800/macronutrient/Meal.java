package edu.cpp.cs5800.macronutrient;

import edu.cpp.cs5800.macronutrient.carbs.Carbs;
import edu.cpp.cs5800.macronutrient.fats.Fats;
import edu.cpp.cs5800.macronutrient.protein.Protein;

public class Meal {
    private Carbs carbs;
    private Fats fats;
    private Protein protein;

    public Meal(Carbs carbs, Fats fats, Protein protein) {
        this.carbs = carbs;
        this.fats = fats;
        this.protein = protein;
    }

    @Override
    public String toString() {
        return String.format("Meal: %s, %s, %s", this.carbs, this.fats, this.protein);
    }
}
