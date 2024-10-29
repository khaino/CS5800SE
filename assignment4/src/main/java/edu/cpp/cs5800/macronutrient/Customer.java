package edu.cpp.cs5800.macronutrient;

import edu.cpp.cs5800.macronutrient.diet.Diet;

public class Customer {
    private String name;
    private Diet diet;

    public Customer(String name, Diet diet) {
        this.name = name;
        this.diet = diet;
    }

    public String getName() {
        return this.name;
    }

    public Diet getDiet() {
        return this.diet;
    }

    @Override
    public String toString() {
        return "Customer (name=" + this.name + ", diet=" + this.diet + ")";
    }
}
