package edu.cpp.cs5800;

import edu.cpp.cs5800.pizza.Pizza;
import edu.cpp.cs5800.pizza.PizzaChain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaChainImpl extends PizzaChain {
    @Override
    public String getName() {
        return "Pizza Chain";
    }
}
public class PizzaChainTest {
    private PizzaChain pizzaChain = new PizzaChainImpl();

    @Test
    public void testSetSize() {
        Pizza pizza = pizzaChain.setSize(Pizza.Size.LARGE).build();
        String expected = "Eating a Large pizza at Pizza Chain with 0 toppings: []";
        assertEquals(expected, pizza.eat());
    }

    @Test
    public void testAddPepperoni() {
        Pizza pizza = pizzaChain.setSize(Pizza.Size.LARGE).addPepperoni().build();
        String expected = "Eating a Large pizza at Pizza Chain with 1 toppings: [Pepperoni]";;
        assertEquals(expected, pizza.eat());
    }

    @Test
    public void testAddSausage() {
        Pizza pizza = pizzaChain.setSize(Pizza.Size.LARGE).addSausage().build();
        String expected = "Eating a Large pizza at Pizza Chain with 1 toppings: [Sausage]";;
        assertEquals(expected, pizza.eat());
    }

    @Test
    public void testAddMushrooms() {
        Pizza pizza = pizzaChain.setSize(Pizza.Size.LARGE).addMushrooms().build();
        String expected = "Eating a Large pizza at Pizza Chain with 1 toppings: [Mushrooms]";;
        assertEquals(expected, pizza.eat());
    }

    @Test
    public void testAddBacon() {
        Pizza pizza = pizzaChain.setSize(Pizza.Size.LARGE).addBacon().build();
        String expected = "Eating a Large pizza at Pizza Chain with 1 toppings: [Bacon]";;
        assertEquals(expected, pizza.eat());
    }

    @Test
    public void testAddOnions() {
        Pizza pizza = pizzaChain.setSize(Pizza.Size.LARGE).addOnions().build();
        String expected = "Eating a Large pizza at Pizza Chain with 1 toppings: [Onions]";;
        assertEquals(expected, pizza.eat());
    }

    @Test
    public void testExtraCheese() {
        Pizza pizza = pizzaChain.setSize(Pizza.Size.LARGE).addExtraCheese().build();
        String expected = "Eating a Large pizza at Pizza Chain with 1 toppings: [Extra Cheese]";;
        assertEquals(expected, pizza.eat());
    }

    @Test
    public void testAddPeppers() {
        Pizza pizza = pizzaChain.setSize(Pizza.Size.LARGE).addPeppers().build();
        String expected = "Eating a Large pizza at Pizza Chain with 1 toppings: [Peppers]";;
        assertEquals(expected, pizza.eat());
    }

    @Test
    public void testAddChicken() {
        Pizza pizza = pizzaChain.setSize(Pizza.Size.LARGE).addChicken().build();
        String expected = "Eating a Large pizza at Pizza Chain with 1 toppings: [Chicken]";;
        assertEquals(expected, pizza.eat());
    }

    @Test
    public void testAddOlives() {
        Pizza pizza = pizzaChain.setSize(Pizza.Size.LARGE).addOlives().build();
        String expected = "Eating a Large pizza at Pizza Chain with 1 toppings: [Olives]";;
        assertEquals(expected, pizza.eat());
    }

    @Test
    public void testAddSpinach() {
        Pizza pizza = pizzaChain.setSize(Pizza.Size.LARGE).addSpinach().build();
        String expected = "Eating a Large pizza at Pizza Chain with 1 toppings: [Spinach]";;
        assertEquals(expected, pizza.eat());
    }

    @Test
    public void testAddTomatoAndBasil() {
        Pizza pizza = pizzaChain.setSize(Pizza.Size.LARGE).addTomatoAndBasil().build();
        String expected = "Eating a Large pizza at Pizza Chain with 1 toppings: [Tomato and Basil]";;
        assertEquals(expected, pizza.eat());
    }

    @Test
    public void testAddBeef() {
        Pizza pizza = pizzaChain.setSize(Pizza.Size.LARGE).addBeef().build();
        String expected = "Eating a Large pizza at Pizza Chain with 1 toppings: [Beef]";;
        assertEquals(expected, pizza.eat());
    }

    @Test
    public void testAddHam() {
        Pizza pizza = pizzaChain.setSize(Pizza.Size.LARGE).addHam().build();
        String expected = "Eating a Large pizza at Pizza Chain with 1 toppings: [Ham]";;
        assertEquals(expected, pizza.eat());
    }

    @Test
    public void testAddPesto() {
        Pizza pizza = pizzaChain.setSize(Pizza.Size.LARGE).addPesto().build();
        String expected = "Eating a Large pizza at Pizza Chain with 1 toppings: [Pesto]";;
        assertEquals(expected, pizza.eat());
    }

    @Test
    public void testAddSpicyPork() {
        Pizza pizza = pizzaChain.setSize(Pizza.Size.LARGE).addSpicyPork().build();
        String expected = "Eating a Large pizza at Pizza Chain with 1 toppings: [Spicy Pork]";;
        assertEquals(expected, pizza.eat());
    }

    @Test
    public void testAddHamAndPineapple() {
        Pizza pizza = pizzaChain.setSize(Pizza.Size.LARGE).addHamAndPineapple().build();
        String expected = "Eating a Large pizza at Pizza Chain with 1 toppings: [Ham and Pineapple]";;
        assertEquals(expected, pizza.eat());
    }

    @Test
    public void testAddingMultipleToppings() {
        Pizza pizza = pizzaChain.setSize(Pizza.Size.LARGE)
                .addBeef()
                .addHamAndPineapple()
                .addPesto()
                .build();
        String expected = "Eating a Large pizza at Pizza Chain with 3 toppings: [Beef, Ham and Pineapple, Pesto]";;
        assertEquals(expected, pizza.eat());
    }
}
