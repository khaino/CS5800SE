package edu.cpp.cs5800.macronutrient;

import edu.cpp.cs5800.macronutrient.carbs.Carbs;
import edu.cpp.cs5800.macronutrient.diet.NoRestriction;
import edu.cpp.cs5800.macronutrient.diet.NutAllergy;
import edu.cpp.cs5800.macronutrient.diet.Paleo;
import edu.cpp.cs5800.macronutrient.diet.Vegan;
import edu.cpp.cs5800.macronutrient.fats.Fats;
import edu.cpp.cs5800.macronutrient.protein.Protein;

public class MacroNutrientDriver {
    public static void main(String[] args) {
        Customer[] customers = new Customer[6];
        customers[0] = new Customer("John", new NoRestriction());
        customers[1] = new Customer("Robertson", new NutAllergy());
        customers[2] = new Customer("Alicia", new Paleo());
        customers[3] = new Customer("Paxton", new Vegan());
        customers[4] = new Customer("Jimmy", new NoRestriction());
        customers[5] = new Customer("Jayvon", new Paleo());

        for (Customer customer : customers) {
            MacronutrientFactory factory = MacroNutrientFactoryCreator.createFactory(customer.getDiet());
            Carbs carbs = factory.createCarbs();
            Fats fats = factory.createFats();
            Protein protein = factory.createProtein();
            Meal meal = new Meal(carbs, fats, protein);
            String message = String.format("%s, %s", customer, meal);
            System.out.println(message);
        }
    }
}
