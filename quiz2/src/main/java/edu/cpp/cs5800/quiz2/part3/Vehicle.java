package edu.cpp.cs5800.quiz2.part3;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public abstract class Vehicle implements PropertyChangeListener {
    protected DrivingBehavior drivingBehavior;

    public Vehicle(DrivingBehavior drivingBehavior) {
        this.drivingBehavior = drivingBehavior;
    }

    public void printNotification(String type, String action) {
        System.out.println(type + ": " + action);
    }
}
