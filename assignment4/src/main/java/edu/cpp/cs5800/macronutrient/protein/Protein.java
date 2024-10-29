package edu.cpp.cs5800.macronutrient.protein;

import edu.cpp.cs5800.macronutrient.Food;

public abstract class Protein extends Food {
    private final static String type = "Protein";

    public String getType() {
        return type;
    }
}
