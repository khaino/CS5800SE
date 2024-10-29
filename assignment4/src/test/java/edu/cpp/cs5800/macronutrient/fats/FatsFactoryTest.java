package edu.cpp.cs5800.macronutrient.fats;

import edu.cpp.cs5800.macronutrient.diet.Vegan;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FatsFactoryTest {

    private List<String> allFats = List.of("Avocado", "Peanuts", "Sour cream", "Tuna");
    private FatsFactory factory = FatsFactory.getInstance();

    @Test
    public void TestGetFats() {
        Fats fats = factory.getFats(new Vegan());
        assertTrue(allFats.contains(fats.getName()));
        assertEquals("Fats", fats.getType());
    }

    @Test
    public void TestGetItems() {
        List<String> items = factory.getItems();
        assertEquals(allFats, items);
    }
}
