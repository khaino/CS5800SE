package edu.cpp.cs5800;

public class VeggieBurger implements FoodItem {

    private static final double price = 4.5;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return Formatter.format("Veggie Burger", price);
    }
}
