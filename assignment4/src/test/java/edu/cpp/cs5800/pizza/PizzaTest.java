package edu.cpp.cs5800.pizza;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTest {

    @Test
    public void testPizzaSizeSmall() {
        Pizza.Size size = Pizza.Size.SMALL;
        assertEquals("Small", size.toString());
    }

    @Test
    public void testPizzaSizeMedium() {
        Pizza.Size size = Pizza.Size.MEDIUM;
        assertEquals("Medium", size.toString());
    }

    @Test
    public void testPizzaSizeLarge() {
        Pizza.Size size = Pizza.Size.LARGE;
        assertEquals("Large", size.toString());
    }

    @Test
    public void testPizzaTopping() {
        Pizza.Topping topping = Pizza.Topping.PEPPERONI;
        assertEquals("Pepperoni", topping.toString());
    }

    @Test
    public void testPizzaSize() {
        List<Pizza.Topping> toppings = new ArrayList<>();
        toppings.add(Pizza.Topping.EXTRA_CHEESE);
        Pizza pizza = new Pizza(Pizza.Size.MEDIUM, toppings, "PizzaChain");
        String expected = "Eating a Medium pizza at PizzaChain with 1 toppings: [Extra Cheese]";
        assertEquals(expected, pizza.eat());
    }

    @Test
    public void testPizzaChainName() {
        List<Pizza.Topping> toppings = new ArrayList<>();
        toppings.add(Pizza.Topping.EXTRA_CHEESE);
        Pizza pizza = new Pizza(Pizza.Size.MEDIUM, toppings, "ABC");
        String expected = "Eating a Medium pizza at ABC with 1 toppings: [Extra Cheese]";
        assertEquals(expected, pizza.eat());
    }

    @Test
    public void testPizzaToppingCount() {
        List<Pizza.Topping> toppings = new ArrayList<>();
        toppings.add(Pizza.Topping.EXTRA_CHEESE);
        toppings.add(Pizza.Topping.HAM);
        Pizza pizza = new Pizza(Pizza.Size.MEDIUM, toppings, "ABC");
        String expected = "Eating a Medium pizza at ABC with 2 toppings: [Extra Cheese, Ham]";
        assertEquals(expected, pizza.eat());
    }

    @Test
    public void testPizzaToppings() {
        List<Pizza.Topping> toppings = new ArrayList<>();
        toppings.add(Pizza.Topping.EXTRA_CHEESE);
        toppings.add(Pizza.Topping.HAM);
        Pizza pizza = new Pizza(Pizza.Size.MEDIUM, toppings, "ABC");
        String expected = "Eating a Medium pizza at ABC with 2 toppings: [Extra Cheese, Ham]";
        assertEquals(expected, pizza.eat());
    }
}
