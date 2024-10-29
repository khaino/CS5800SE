package edu.cpp.cs5800.macronutrient;

public abstract class Carbs {
    private final static String type = "Carbs";

    public String getType() {
        return type;
    }
    public abstract String getName();
}
