package edu.cpp.cs5800.macronutrient;

import edu.cpp.cs5800.macronutrient.diet.Diet;
import edu.cpp.cs5800.macronutrient.diet.Vegan;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    @Test
    public void testToString() {
        String customerName = "John Doe";
        Diet diet = new Vegan();

        String expected = "Customer (name=" + customerName + ", diet=" + diet + ")";
        String actual = (new Customer(customerName, diet)).toString();
        assertEquals(expected, actual);
    }
}
