package edu.cpp.cs5800;

import edu.cpp.cs5800.pizza.Dominos;
import edu.cpp.cs5800.pizza.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DominosTest {
    @Test
    public void testDominosName() {
        Pizza pizza = (new Dominos()).setSize(Pizza.Size.SMALL).build();
        String expected = "Eating a Small pizza at Dominos with 0 toppings: []";
        assertEquals(expected, pizza.eat());
    }
}
