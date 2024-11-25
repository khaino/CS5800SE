package edu.cpp.cs5800.quiz2.part3;

public class Aggrassive extends DrivingBehavior {

    @Override
    public String action(String color) {
        if (color.equals("RED")) {
            return "SlamBrake";
        } else if (color.equals("GREEN")) {
            return "Need4Speed";
        } else {
            return "Faster";
        }
    }
}
