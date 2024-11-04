package edu.cpp.cs5800;

public class ChickenBurger implements FoodItem {

    private static final double price = 5.5;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return Formatter.format("Chicken Burger", price);
    }
}
