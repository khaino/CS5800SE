package edu.cpp.cs5800.pizza;

public class PizzaDriver {
    public static void main(String[] args) {
        Pizza smallPizza = new PizzaHut()
                .setSize(Pizza.Size.SMALL)
                .addBacon()
                .addMushrooms()
                .addMushrooms()
                .build();

        Pizza mediumPizza = new PizzaHut()
                .setSize(Pizza.Size.MEDIUM)
                .addOlives()
                .addChicken()
                .addSausage()
                .addBacon()
                .addPesto()
                .addPepperoni()
                .build();

        Pizza largePizza = new PizzaHut()
                .setSize(Pizza.Size.LARGE)
                .addHamAndPineapple()
                .addOlives()
                .addSpinach()
                .addChicken()
                .addPesto()
                .addSausage()
                .addBacon()
                .addOnions()
                .addPepperoni()
                .build();

        System.out.println(smallPizza.eat());
        System.out.println(mediumPizza.eat());
        System.out.println(largePizza.eat());

        Pizza pizzaHutLarge = new PizzaHut()
                .setSize(Pizza.Size.LARGE)
                .addOnions()
                .addPesto()
                .addPepperoni()
                .build();

        Pizza pizzaHutSmall = new PizzaHut()
                .setSize(Pizza.Size.SMALL)
                .addPeppers()
                .addTomatoAndBasil()
                .build();

        Pizza littleCaesarsMedium = new LittleCaesars()
                .setSize(Pizza.Size.MEDIUM)
                .addExtraCheese()
                .addOnions()
                .addBeef()
                .addPesto()
                .addSausage()
                .addPepperoni()
                .addSpicyPork()
                .addOlives()
                .build();

        Pizza littleCaesarsSmall = new LittleCaesars()
                .setSize(Pizza.Size.SMALL)
                .addSausage()
                .addBeef()
                .addHamAndPineapple()
                .addPeppers()
                .addTomatoAndBasil()
                .addHam()
                .build();

        Pizza dominosSmall = new Dominos()
                .setSize(Pizza.Size.MEDIUM)
                .addSpicyPork()
                .build();

        Pizza dominosLarge = new Dominos()
                .setSize(Pizza.Size.SMALL)
                .addHamAndPineapple()
                .addPeppers()
                .addTomatoAndBasil()
                .build();

        System.out.println("------Print for each pizza chain------");
        System.out.println(pizzaHutLarge.eat());
        System.out.println(pizzaHutSmall.eat());
        System.out.println(littleCaesarsMedium.eat());
        System.out.println(littleCaesarsSmall.eat());
        System.out.println(dominosSmall.eat());
        System.out.println(dominosLarge.eat());
    }
}
