package edu.cpp.cs5800.macronutrient;

import edu.cpp.cs5800.macronutrient.carbs.CarbsFactory;
import edu.cpp.cs5800.macronutrient.diet.NutAllergy;
import edu.cpp.cs5800.macronutrient.diet.Vegan;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FoodFactoryImpl extends FoodFactory {
    private static FoodFactory instance;

    @Override
    public List<String> getItems() {
        return List.of("Pistachio", "Peanuts", "Chicken");
    }

    public static FoodFactory getInstance() {
        if (instance == null) {
            instance = new FoodFactoryImpl();
        }

        return instance;
    }
}

public class FoodFactoryTest {
    @Test
    public void testGetFoodName() {
        FoodFactory foodFactory = FoodFactoryImpl.getInstance();
        String expected = "Chicken";
        String actual = foodFactory.getFoodName(new NutAllergy());
        assertEquals(expected, actual);
    }
}
