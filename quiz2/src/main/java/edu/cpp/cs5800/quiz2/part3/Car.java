package edu.cpp.cs5800.quiz2.part3;

import java.beans.PropertyChangeEvent;

public class Car extends Vehicle {
    public Car(DrivingBehavior drivingBehavior) {
        super(drivingBehavior);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String color = (String) evt.getNewValue();

        printNotification("Car", this.drivingBehavior.action(color));
    }
}
