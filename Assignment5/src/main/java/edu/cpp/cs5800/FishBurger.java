package edu.cpp.cs5800;

public class FishBurger implements FoodItem {

    private static final double price = 6.0;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return Formatter.format("Fish Burger", price);
    }
}
