package edu.cpp.cs5800.macronutrient.protein;

import edu.cpp.cs5800.macronutrient.diet.Vegan;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProteinFactoryTest {

    private List<String> allProteins = List.of("Beef", "Chicken", "Fish", "Tofu");
    private ProteinFactory factory = ProteinFactory.getInstance();

    @Test
    public void TestGetProtein() {
        Protein protein = factory.getProtein(new Vegan());
        assertTrue(allProteins.contains(protein.getName()));
        assertEquals("Protein", protein.getType());
    }

    @Test
    public void TestGetItems() {
        List<String> items = factory.getItems();
        assertEquals(allProteins, items);
    }
}
