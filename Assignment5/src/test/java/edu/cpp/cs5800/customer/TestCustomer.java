package edu.cpp.cs5800.customer;

import edu.cpp.cs5800.Formatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCustomer {
    Customer customer = new Customer();

    @Test
    public void testGetDiscountPercentage() {
        assertEquals(0.0, customer.getDiscountPercentage());
    }

    @Test
    public void testApplyLoyaltyDiscount() {
        String expected = Formatter.format("After 0% Discount:",10.0);
        assertEquals(expected, customer.applyLoyaltyDiscount(10.0));
    }
}
