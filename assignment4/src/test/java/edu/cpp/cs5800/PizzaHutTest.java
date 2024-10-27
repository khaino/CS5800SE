package edu.cpp.cs5800;

import edu.cpp.cs5800.pizza.Pizza;
import edu.cpp.cs5800.pizza.PizzaHut;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaHutTest {
    @Test
    public void testPizzaHutName() {
        Pizza pizza = (new PizzaHut()).setSize(Pizza.Size.SMALL).build();
        String expected = "Eating a Small pizza at Pizza Hut with 0 toppings: []";
        assertEquals(expected, pizza.eat());
    }
}
