package edu.cpp.cs5800.pizza;

import java.util.List;

public class Pizza {
    public enum Size {
        SMALL("Small"),
        MEDIUM("Medium"),
        LARGE("Large");

        private final String size;

        Size(String size) {
            this.size = size;
        }

        @Override
        public String toString() {
            return size;
        }
    }

    public enum Topping {
        PEPPERONI("Pepperoni"),
        SAUSAGE("Sausage"),
        MUSHROOMS("Mushrooms"),
        BACON("Bacon"),
        ONIONS("Onions"),
        EXTRA_CHEESE("Extra Cheese"),
        PEPPERS("Peppers"),
        CHICKEN("Chicken"),
        OLIVES("Olives"),
        SPINACH("Spinach"),
        TOMATO_AND_BASIL("Tomato and Basil"),
        BEEF("Beef"),
        HAM("Ham"),
        PESTO("Pesto"),
        SPICY_PORK("Spicy Pork"),
        HAM_AND_PINEAPPLE("Ham and Pineapple");

        private final String toppingName;

        Topping(String toppingName) {
            this.toppingName = toppingName;
        }

        @Override
        public String toString() {
            return toppingName;
        }
    }

    private Size size;
    private List<Topping> toppings;
    private String chainName;

    public Pizza(Size size, List<Topping> toppings, String chainName) {
        this.size = size;
        this.toppings = toppings;
        this.chainName = chainName;
    }

    public String eat() {
        return "Eating a " + this.size + " pizza at " +  this.chainName + " with " + this.toppings.size() + " toppings: " + this.toppings;
    }
}
