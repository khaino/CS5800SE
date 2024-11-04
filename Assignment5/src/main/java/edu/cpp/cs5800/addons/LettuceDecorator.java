package edu.cpp.cs5800.addons;

import edu.cpp.cs5800.FoodItem;
import edu.cpp.cs5800.Formatter;

public class LettuceDecorator extends AddOnDecorator {

    private static final double price = 0.5;

    public LettuceDecorator(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getPrice() {
        return this.foodItem.getPrice() + price;
    }

    @Override
    public String getDescription() {
        return this.foodItem.getDescription() + Formatter.format("+ Lettuce", price);
    }
}
