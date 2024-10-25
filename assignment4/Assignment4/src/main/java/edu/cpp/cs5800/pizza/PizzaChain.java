package edu.cpp.cs5800.pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    private Pizza.Size size;
    private List<Pizza.Topping> toppings = new ArrayList<>();

    public PizzaBuilder() {

    }

    public PizzaBuilder setSize(Pizza.Size size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder addPepperoni() {
        this.toppings.add(Pizza.Topping.PEPPERONI);
        return this;
    }

    public PizzaBuilder addSausage() {
        this.toppings.add(Pizza.Topping.SAUSAGE);
        return this;
    }

    public PizzaBuilder addMushrooms() {
        this.toppings.add(Pizza.Topping.MUSHROOMS);
        return this;
    }

    public PizzaBuilder addBacon() {
        this.toppings.add(Pizza.Topping.BACON);
        return this;
    }

    public PizzaBuilder addOnions() {
        this.toppings.add(Pizza.Topping.ONIONS);
        return this;
    }

    public PizzaBuilder addExtraCheese() {
        this.toppings.add(Pizza.Topping.EXTRA_CHEESE);
        return this;
    }

    public PizzaBuilder addPeppers() {
        this.toppings.add(Pizza.Topping.PEPPERS);
        return this;
    }

    public PizzaBuilder addChicken() {
        this.toppings.add(Pizza.Topping.CHICKEN);
        return this;
    }

    public PizzaBuilder addOlives() {
        this.toppings.add(Pizza.Topping.OLIVES);
        return this;
    }

    public PizzaBuilder addSpinach() {
        this.toppings.add(Pizza.Topping.SPINACH);
        return this;
    }

    public PizzaBuilder addTomatoAndBasil() {
        this.toppings.add(Pizza.Topping.TOMATO_AND_BASIL);
        return this;
    }

    public PizzaBuilder addBeef() {
        this.toppings.add(Pizza.Topping.BEEF);
        return this;
    }

    public PizzaBuilder addHam() {
        this.toppings.add(Pizza.Topping.HAM);
        return this;
    }

    public PizzaBuilder addPesto() {
        this.toppings.add(Pizza.Topping.PESTO);
        return this;
    }

    public PizzaBuilder addSpicyPork() {
        this.toppings.add(Pizza.Topping.SPICY_PORK);
        return this;
    }

    public PizzaBuilder addHamAndPineapple() {
        this.toppings.add(Pizza.Topping.HAM_AND_PINEAPPLE);
        return this;
    }

    public Pizza build() {
        return new Pizza(this.size, this.toppings);
    }
}
