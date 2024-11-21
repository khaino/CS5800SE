package edu.cpp.cs5800.quiz2.part2;

import java.beans.PropertyChangeEvent;

public class Truck extends Vehicle {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        printNotification("Truck", evt);
    }
}
