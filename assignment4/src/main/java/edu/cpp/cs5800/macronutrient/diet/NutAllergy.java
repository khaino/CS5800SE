package edu.cpp.cs5800.macronutrient.diet;

import java.util.List;

public class NutAllergy extends Diet {
    @Override
    public List<String> getNonEatableItems() {
        return List.of("Pistachio", "Peanuts");
    }
}