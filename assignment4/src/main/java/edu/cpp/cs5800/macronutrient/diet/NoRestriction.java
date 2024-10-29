package edu.cpp.cs5800.macronutrient;

import java.util.List;

public class NoRestriction extends Diet{
    private static final List<String> nonEatableIngredients = List.of();

    @Override
    public List<String> getNonEatable() {
        return nonEatableIngredients;
    }
}
