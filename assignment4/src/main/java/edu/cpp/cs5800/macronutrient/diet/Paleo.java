package edu.cpp.cs5800.macronutrient;

import java.util.List;

public class Paleo extends Diet {
    private static final List<String> nonEatableIngredients = List.of("Cheese", "Bread", "Lentils");

    @Override
    public List<String> getNonEatable() {
        return nonEatableIngredients;
    }
}
