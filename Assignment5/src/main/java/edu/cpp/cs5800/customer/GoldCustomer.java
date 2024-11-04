package edu.cpp.cs5800.customer;

public class GoldCustomer extends Customer {
    @Override
    public int getDiscountPercentage() {
        return 15;
    }
}
