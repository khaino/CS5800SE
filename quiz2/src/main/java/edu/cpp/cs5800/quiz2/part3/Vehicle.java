package edu.cpp.cs5800.quiz2.part2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public abstract class Vehicle implements PropertyChangeListener {
    public void printNotification(String type, PropertyChangeEvent evt) {
        System.out.println(type + ": Traffic Changed from " + (String) evt.getOldValue() + " to " + (String) evt.getNewValue() );
    }

}
