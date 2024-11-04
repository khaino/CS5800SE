package edu.cpp.cs5800.customer;

import edu.cpp.cs5800.Formatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPlatinumCustomer {
    Customer customer = new PlatinumCustomer();

    @Test
    public void testGetDiscountPercentage() {
        assertEquals(20.0, customer.getDiscountPercentage());
    }

    @Test
    public void testApplyLoyaltyDiscount() {
        String expected = Formatter.format("After 20% Discount:",8.0);
        assertEquals(expected, customer.applyLoyaltyDiscount(10.0));
    }
}
