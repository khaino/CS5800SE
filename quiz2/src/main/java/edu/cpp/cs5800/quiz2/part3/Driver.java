package edu.cpp.cs5800.quiz2.part3;

public class Driver {
    public static void main(String[] args) {
        Car car = new Car(new Aggrassive());
        Motorcycle motorcycle = new Motorcycle(new Normal());
        Truck truck = new Truck(new Passive());

        TrafficLight traffic = new TrafficLight();
        traffic.addPropertyChangeListener(car);
        traffic.addPropertyChangeListener(motorcycle);
        traffic.addPropertyChangeListener(truck);

        traffic.changeColor();
        traffic.changeColor();
        traffic.changeColor();
    }
}
