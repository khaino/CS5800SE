package edu.cpp.cs5800.macronutrient;

import edu.cpp.cs5800.macronutrient.diet.Diet;

import java.util.List;
import java.util.Random;

public abstract class FoodFactory {
    private final Random rand = new Random();

    public String getFoodName(Diet diet) {
        List<String> nonEatableItems = diet.getNonEatableItems();
        List<String> eatableItems = this.getItems()
                .stream()
                .filter(item -> !nonEatableItems.contains(item))
                .toList();
        return eatableItems.get(rand.nextInt(eatableItems.size()));
    }

    public abstract List<String> getItems();
}
