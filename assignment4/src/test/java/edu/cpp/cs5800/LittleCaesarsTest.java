package edu.cpp.cs5800;

import edu.cpp.cs5800.pizza.LittleCaesars;
import edu.cpp.cs5800.pizza.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LittleCaesarsTest {

    @Test
    public void testLittleCaesarsName() {
        Pizza pizza = (new LittleCaesars()).setSize(Pizza.Size.SMALL).build();
        String expected = "Eating a Small pizza at Little Caesars with 0 toppings: []";
        assertEquals(expected, pizza.eat());
    }
}
