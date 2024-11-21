package edu.cpp.cs5800.quiz2.part2;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        printNotification("Car", evt);
    }
}
