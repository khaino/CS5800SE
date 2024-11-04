package edu.cpp.cs5800.addons;

import edu.cpp.cs5800.FoodItem;

public abstract class AddOnDecorator implements FoodItem {
    protected FoodItem foodItem;

    public AddOnDecorator(FoodItem foodItem) {
        this.foodItem = foodItem;
    }
}
