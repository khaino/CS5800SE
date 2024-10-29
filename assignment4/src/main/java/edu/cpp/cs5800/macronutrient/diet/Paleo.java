package edu.cpp.cs5800.macronutrient.diet;

import java.util.List;

public class Paleo extends Diet {
    @Override
    public List<String> getNonEatableItems() {
        return List.of("Cheese", "Bread", "Lentils", "Tofu", "Cheese", "Sour cream");
    }
}
