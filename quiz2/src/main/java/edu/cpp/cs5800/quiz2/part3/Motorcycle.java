package edu.cpp.cs5800.quiz2.part3;

import java.beans.PropertyChangeEvent;

public class Motorcycle extends Vehicle {
    public Motorcycle(DrivingBehavior drivingBehavior) {
        super(drivingBehavior);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String color = (String) evt.getNewValue();

        printNotification("Motorcycle", this.drivingBehavior.action(color));
    }
}
