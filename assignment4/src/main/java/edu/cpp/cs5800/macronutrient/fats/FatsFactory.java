package edu.cpp.cs5800.macronutrient.fats;

import edu.cpp.cs5800.macronutrient.FoodFactory;
import edu.cpp.cs5800.macronutrient.diet.Diet;

import java.util.List;

public class FatsFactory extends FoodFactory {
    private static FatsFactory instance;

    private FatsFactory() {
    }

    public Fats getFats(Diet diet) {
        String foodName = this.getFoodName(diet);
        return createFats(foodName);
    }

    private Fats createFats(String carbsName) {
        switch (carbsName) {
            case "Avocado" -> {
                return new Avocado();
            }
            case "Peanuts" -> {
                return new Peanuts();
            }
            case "Sour cream" -> {
                return new SourCream();
            }
            default -> {
                return new Tuna();
            }
        }

    }

    public List<String> getItems() {
        return List.of("Avocado", "Peanuts", "Sour cream", "Tuna");
    }

    public static FatsFactory getInstance() {
        if (instance == null) {
            instance = new FatsFactory();
        }

        return instance;
    }
}
