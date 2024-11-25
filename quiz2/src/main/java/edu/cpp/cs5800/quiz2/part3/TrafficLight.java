package edu.cpp.cs5800.quiz2.part3;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Random;

public class TrafficLight {
    private String color;
    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public TrafficLight() {
        Random rand = new Random();
        int i = rand.nextInt() % 3;
        if (i == 0) {
            color = "RED";
        } else if (i == 1) {
            color = "YELLOW";
        } else {
            color = "GREEN";
        }
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.support.addPropertyChangeListener(listener);
    }

    public void changeColor() {
        String newColor = color;
        if (color == "RED") {
            newColor = "GREEN";
        } else if (color == "YELLOW") {
            newColor = "RED";
        } else if (color == "GREEN") {
            newColor = "YELLOW";
        }

        support.firePropertyChange("color", this.color, newColor);
        this.color = newColor;
    }
}
