package edu.cpp.cs5800.macronutrient.diet;

import java.util.List;

public class Paleo extends Diet {
    private static final List<String> nonEatableIngredients
            = List.of("Cheese", "Bread", "Lentils", "Tofu", "Cheese", "Sour cream");

    @Override
    public List<String> getNonEatable() {
        return nonEatableIngredients;
    }
}
