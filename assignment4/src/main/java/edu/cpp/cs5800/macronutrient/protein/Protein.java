package edu.cpp.cs5800.protein;

public abstract class Protein {
    private final static String type = "Protein";

    public String getType() {
        return type;
    }
    public abstract String getName();
}
