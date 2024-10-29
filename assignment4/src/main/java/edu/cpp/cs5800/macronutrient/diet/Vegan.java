package edu.cpp.cs5800.macronutrient.diet;

import java.util.List;

public class Vegan extends Diet {
    @Override
    public List<String> getNonEatableItems() {
        return List.of("Fish", "Chicken", "Tuna", "Cheese", "Sour cream");
    }
}
