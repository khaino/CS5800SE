package edu.cpp.cs5800.macronutrient.diet;

import java.util.Arrays;
import java.util.List;

public abstract class Diet {
    public abstract List<String> getNonEatableItems();
    @Override
    public String toString() {
        return String.format("%s: Restricted%s", this.getClass().getSimpleName(), Arrays.toString(this.getNonEatableItems().toArray()));
    }
}
