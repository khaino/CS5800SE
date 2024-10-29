package edu.cpp.cs5800.macronutrient;

import edu.cpp.cs5800.macronutrient.carbs.Carbs;
import edu.cpp.cs5800.macronutrient.carbs.CarbsFactory;
import edu.cpp.cs5800.macronutrient.fats.Fats;
import edu.cpp.cs5800.macronutrient.fats.FatsFactory;
import edu.cpp.cs5800.macronutrient.protein.Protein;
import edu.cpp.cs5800.macronutrient.protein.ProteinFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NoRestrictionMealFactoryTest {
    MacronutrientFactory factory = NoRestrictionMealFactory.getInstance();

    @Test
    public void TestCreateCarbs() {
        Carbs carbs = factory.createCarbs();
        List<String> allCarbs = CarbsFactory.getInstance().getItems();
        assertTrue(allCarbs.contains(carbs.getName()));
    }

    @Test
    public void TestCreateProtein() {
        Protein protein = factory.createProtein();
        List<String> allProtein = ProteinFactory.getInstance().getItems();
        assertTrue(allProtein.contains(protein.getName()));
    }

    @Test
    public void TestCreateFats() {
        Fats fats = factory.createFats();
        List<String> allFats = FatsFactory.getInstance().getItems();
        assertTrue(allFats.contains(fats.getName()));
    }
}
