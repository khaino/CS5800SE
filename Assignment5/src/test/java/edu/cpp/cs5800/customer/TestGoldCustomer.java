package edu.cpp.cs5800.customer;

import edu.cpp.cs5800.Formatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGoldCustomer {
    Customer customer = new GoldCustomer();

    @Test
    public void testGetDiscountPercentage() {
        assertEquals(15.0, customer.getDiscountPercentage());
    }

    @Test
    public void testApplyLoyaltyDiscount() {
        String expected = Formatter.format("After 15% Discount:",8.5);
        assertEquals(expected, customer.applyLoyaltyDiscount(10.0));
    }
}
