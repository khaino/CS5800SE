package edu.cpp.cs5800.macronutrient.carbs;

import edu.cpp.cs5800.macronutrient.Food;

public abstract class Carbs extends Food {
    private final static String type = "Carbs";

    public String getType() {
        return type;
    }
}
