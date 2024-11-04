package edu.cpp.cs5800.customer;

import edu.cpp.cs5800.Formatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSilverCustomer {
    Customer customer = new SilverCustomer();

    @Test
    public void testGetDiscountPercentage() {
        assertEquals(10.0, customer.getDiscountPercentage());
    }

    @Test
    public void testApplyLoyaltyDiscount() {
        String expected = Formatter.format("After 10% Discount:",9.0);
        assertEquals(expected, customer.applyLoyaltyDiscount(10.0));
    }
}
