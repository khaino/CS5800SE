package edu.cpp.cs5800.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class PizzaChain {
    private Pizza.Size size;
    private List<Pizza.Topping> toppings = new ArrayList<>();

    public PizzaChain setSize(Pizza.Size size) {
        this.size = size;
        return this;
    }

    public PizzaChain addPepperoni() {
        this.toppings.add(Pizza.Topping.PEPPERONI);
        return this;
    }

    public PizzaChain addSausage() {
        this.toppings.add(Pizza.Topping.SAUSAGE);
        return this;
    }

    public PizzaChain addMushrooms() {
        this.toppings.add(Pizza.Topping.MUSHROOMS);
        return this;
    }

    public PizzaChain addBacon() {
        this.toppings.add(Pizza.Topping.BACON);
        return this;
    }

    public PizzaChain addOnions() {
        this.toppings.add(Pizza.Topping.ONIONS);
        return this;
    }

    public PizzaChain addExtraCheese() {
        this.toppings.add(Pizza.Topping.EXTRA_CHEESE);
        return this;
    }

    public PizzaChain addPeppers() {
        this.toppings.add(Pizza.Topping.PEPPERS);
        return this;
    }

    public PizzaChain addChicken() {
        this.toppings.add(Pizza.Topping.CHICKEN);
        return this;
    }

    public PizzaChain addOlives() {
        this.toppings.add(Pizza.Topping.OLIVES);
        return this;
    }

    public PizzaChain addSpinach() {
        this.toppings.add(Pizza.Topping.SPINACH);
        return this;
    }

    public PizzaChain addTomatoAndBasil() {
        this.toppings.add(Pizza.Topping.TOMATO_AND_BASIL);
        return this;
    }

    public PizzaChain addBeef() {
        this.toppings.add(Pizza.Topping.BEEF);
        return this;
    }

    public PizzaChain addHam() {
        this.toppings.add(Pizza.Topping.HAM);
        return this;
    }

    public PizzaChain addPesto() {
        this.toppings.add(Pizza.Topping.PESTO);
        return this;
    }

    public PizzaChain addSpicyPork() {
        this.toppings.add(Pizza.Topping.SPICY_PORK);
        return this;
    }

    public PizzaChain addHamAndPineapple() {
        this.toppings.add(Pizza.Topping.HAM_AND_PINEAPPLE);
        return this;
    }

    public Pizza build() {
        return new Pizza(this.size, this.toppings, this.getName());
    }

    protected abstract String getName();
}
