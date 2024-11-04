package edu.cpp.cs5800;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {
    VeggieBurger veggieBurger = new VeggieBurger();
    FishBurger fishBurger = new FishBurger();

    @Test
    public void testAddItem() {
        Order order = new Order();
        assertEquals(1, order.addItem(veggieBurger));
        assertEquals(2, order.addItem(fishBurger));
    }

    @Test
    public void testGetTotalPrice() {
        Order order = new Order();
        order.addItem(veggieBurger);
        order.addItem(fishBurger);

        double expected = veggieBurger.getPrice() + fishBurger.getPrice();
        assertEquals(expected, order.getTotalPrice());
    }

    @Test
    public void testGetOrderDetails() {
        Order order = new Order();
        order.addItem(veggieBurger);

        String expected = "-------------------------\nOrder No: #2\n-------------------------\nVeggie Burger        4.50\n---------------\nTotal                4.50\n-------------------------\n";
        assertEquals(expected, order.getOrderDetails());
    }
}
