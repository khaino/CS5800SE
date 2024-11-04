package edu.cpp.cs5800.addons;

import edu.cpp.cs5800.FoodItem;
import edu.cpp.cs5800.Formatter;

public class PicklesDecorator extends AddOnDecorator {

    private static final double price = 1.2;

    public PicklesDecorator(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getPrice() {
        return this.foodItem.getPrice() + price;
    }

    @Override
    public String getDescription() {
        return this.foodItem.getDescription() + Formatter.format("+ Pickles", price);
    }
}
