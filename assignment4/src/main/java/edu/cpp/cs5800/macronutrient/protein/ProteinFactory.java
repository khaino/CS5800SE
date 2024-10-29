package edu.cpp.cs5800.macronutrient.protein;

import edu.cpp.cs5800.macronutrient.FoodFactory;
import edu.cpp.cs5800.macronutrient.diet.Diet;

import java.util.List;

public class ProteinFactory extends FoodFactory {
    private static ProteinFactory instance;

    private ProteinFactory() {
    }

    public Protein getProtein(Diet diet) {
        String foodName = this.getFoodName(diet);
        return createProtein(foodName);
    }

    private Protein createProtein(String carbsName) {
        switch (carbsName) {
            case "Beef" -> {
                return new Beef();
            }
            case "Chicken" -> {
                return new Chicken();
            }
            case "Fish" -> {
                return new Fish();
            }
            default ->  {
                return new Tofu();
            }
        }
    }

    public List<String> getItems() {
        return List.of("Beef", "Chicken", "Fish", "Tofu");
    }

    public static ProteinFactory getInstance() {
        if (instance == null) {
            instance = new ProteinFactory();
        }

        return instance;
    }
}
