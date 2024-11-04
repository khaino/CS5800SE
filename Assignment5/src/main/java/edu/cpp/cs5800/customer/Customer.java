package edu.cpp.cs5800.customer;

import edu.cpp.cs5800.Formatter;

public class Customer implements Loyalty {

    @Override
    public int getDiscountPercentage() {
        return 0;
    }

    @Override
    public String applyLoyaltyDiscount(double amount) {
        return Formatter.format("After " + this.getDiscountPercentage() + "% Discount:", ((double) (100 - this.getDiscountPercentage()) / 100 ) * amount);
    }
}
