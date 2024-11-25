package edu.cpp.cs5800.states;

import edu.cpp.cs5800.VendingMachine;
import edu.cpp.cs5800.snacks.Snack;

public class Idle extends StateOfVendingMachine {

    public Idle(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public String selectSnack(int number) {
        Snack snack = this.vendingMachine.getSnack(number);
        String message = "You have selected: " + number + " (" + snack.getName() + ")";
        System.out.println(message);
        this.vendingMachine.setSelectedSnack(number);
        this.vendingMachine.setState(new WaitingForMoney(this.vendingMachine));
        return message;
    }

    @Override
    public String insertMoney(double amount) {
        String message = "Invalid request: Please first select a snack!";
        System.out.println(message);
        return message;
    }

    @Override
    public String dispenseSnack() {
        String message = "Invalid request: Please first select a snack!";
        System.out.println("Invalid request: Please first select a snack!");
        return message;
    }

    public String toString() {
        return "Idle";
    }
}
