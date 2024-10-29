package edu.cpp.cs5800.macronutrient.carbs;

import edu.cpp.cs5800.macronutrient.diet.Vegan;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarbsFactoryTest {

    private List<String> allCurbs = List.of("Cheese", "Bread", "Lentils", "Pistachio");
    private CarbsFactory factory = CarbsFactory.getInstance();

    @Test
    public void TestGetCarbs() {
        Carbs carbs = factory.getCarbs(new Vegan());
        assertTrue(allCurbs.contains(carbs.getName()));
        assertEquals("Carbs", carbs.getType());
    }

    @Test
    public void TestGetItems() {
        List<String> items = factory.getItems();
        assertEquals(allCurbs, items);
    }
}
