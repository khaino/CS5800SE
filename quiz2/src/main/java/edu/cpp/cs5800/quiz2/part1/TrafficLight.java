package edu.cpp.cs5800.quiz2;

import java.util.Random;

public class TrafficLight {
    enum Color {
        RED, YELLOW, BLUE
    }
    private Color color;

    public TrafficLight() {
        Random rand = new Random();
        int i = rand.nextInt()  % 3;
    }

    public void changeColor(Color color) {

    }

}
