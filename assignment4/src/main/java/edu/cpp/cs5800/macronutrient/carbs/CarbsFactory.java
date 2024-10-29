package edu.cpp.cs5800.macronutrient.carbs;

import edu.cpp.cs5800.macronutrient.FoodFactory;
import edu.cpp.cs5800.macronutrient.diet.Diet;

import java.util.List;

public class CarbsFactory extends FoodFactory {
    private static CarbsFactory instance;

    private CarbsFactory() {
    }

    public Carbs getCarbs(Diet diet) {
        String foodName = this.getFoodName(diet);
        return createCarbs(foodName);
    }

    private Carbs createCarbs(String carbsName) {
        switch (carbsName) {
            case "Cheese" -> {
                return new Cheese();
            }
            case "Bread" -> {
                return new Bread();
            }
            case "Lentils" -> {
                return new Lentils();
            }
            default -> {
                return new Pistachio();
            }
        }
    }

    public List<String> getItems() {
        return List.of("Cheese", "Bread", "Lentils", "Pistachio");
    }

    public static CarbsFactory getInstance() {
        if (instance == null) {
            instance = new CarbsFactory();
        }

        return instance;
    }
}
