package edu.cpp.cs5800.quiz2.part1;

import java.util.Random;

public class TrafficLight {
    enum Color {
        RED, YELLOW, GREEN
    }

    private Color color;

    public TrafficLight() {
        Random rand = new Random();
        int i = rand.nextInt()  % 3;
        if (i == 0) {
            color = Color.RED;
        } else if (i == 1) {
            color = Color.YELLOW;
        } else {
            color = Color.GREEN;
        }
    }

    public void changeColor() {
        if (color == Color.RED) {
            color = Color.GREEN;
        } else if (color == Color.YELLOW) {
            color = Color.RED;
        } else {
            color = Color.YELLOW;
        }
    }

    public Color getColor() {
        return color;
    }
}
