package edu.cpp.cs5800.quiz2.part3;

public class Passive extends DrivingBehavior {
    @Override
    public String action(String color) {
        if (color.equals("RED")) {
            return "Stop";
        } else if (color.equals("GREEN")) {
            return "GoSlower";
        } else {
            return "Slower";
        }
    }
}
