package edu.cpp.cs5800.quiz2.part3;

import java.beans.PropertyChangeEvent;

public class Truck extends Vehicle {
    public Truck(DrivingBehavior drivingBehavior) {
        super(drivingBehavior);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String color = (String) evt.getNewValue();

        printNotification("Truck", this.drivingBehavior.action(color));
    }
}
