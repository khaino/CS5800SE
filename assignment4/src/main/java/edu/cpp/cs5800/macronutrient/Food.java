package edu.cpp.cs5800.macronutrient;

public abstract class Food {
    public String toString() {
        return String.format("%s(%s)", this.getType(), this.getName());
    }

    public abstract String getName();

    public abstract String getType();
}
