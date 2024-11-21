package edu.cpp.cs5800.quiz2.part2;

public class Driver {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Truck truck = new Truck();

        TrafficLight traffic = new TrafficLight();
        traffic.addPropertyChangeListener(car);
        traffic.addPropertyChangeListener(motorcycle);
        traffic.addPropertyChangeListener(truck);

        traffic.changeColor();
        traffic.changeColor();
        traffic.changeColor();
    }
}
